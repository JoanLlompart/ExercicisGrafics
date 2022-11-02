public class Exercici1 {
    public static void main(String[] args) {
        Turtle t = new Turtle(800, 600);

        int costatRequadre = 50;
        int nQuadresHoritzontal = 5;
        int nQuadresVertical = 4;

        int totalHoritzontal = nQuadresHoritzontal*(costatRequadre + costatRequadre / 2) - costatRequadre / 2;
        int totalVertical = nQuadresVertical*(costatRequadre + costatRequadre / 2) - costatRequadre / 2;

        t.setPenDown(false);
        t.forward(-totalVertical / 2);
        t.turnLeft(90);
        t.forward(totalHoritzontal / 2);
        t.turnRight(90);
        t.setPenDown(true);

        for (int k = 0; k < nQuadresHoritzontal; k++) {
            dibuixaColumna(t, nQuadresVertical, costatRequadre);
            anarALaSeguentColumna(t, nQuadresVertical, costatRequadre);
        }

        t.show();
    }

    private static void dibuixaColumna(Turtle t, int nQuadresVertical, int costatRequadre) {
        for (int i = 0; i < nQuadresVertical; i++) {
            dibuixaQuadrat(t, costatRequadre);
            t.setPenDown(false);
            t.forward(costatRequadre + costatRequadre / 2);
            t.setPenDown(true);
        }
    }

    private static void anarALaSeguentColumna(Turtle t, int nQuadresVertical, int costatRequadre) {
        //Tornar al punt inicial
        t.setPenDown(false);
        t.forward(-nQuadresVertical * (costatRequadre + costatRequadre / 2));
        t.turnRight(90);
        t.forward(costatRequadre + costatRequadre / 2);
        t.turnLeft(90);
        t.setPenDown(true);
    }

    private static void dibuixaQuadrat(Turtle t, int costatRequadre) {
        for (int j = 0; j < 4; j++) {
            t.forward(costatRequadre);
            t.turnLeft(90);
        }
    }
}