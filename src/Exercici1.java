public class Exercici1 {
    public static void main(String[] args) {
        Turtle t = new Turtle(800, 600); // CREA OBJECTE TURTLE i els pixels que donam de la pizarra(sx:ample) i  (sy: Alt)
/*
        int constatRequadre = 20;
        int nQuadreHorizontal = 6;
        int nQuadresVertical = 8;

        for (int i = 0; i < 4; i++) {
            t.forward(100);
            t.turnLeft(90);
        }

        t.setPenDown(false); // Dibuixa o no dibuixa
        t.forward(200);
        t.setPenDown(true);
        t.forward(50);
        t.show();



 */


        int costatRequadre = 50;
        int nQuadresHoritzontal = 5;
        int nQuadresVertical = 4;

        int totalHoritzontal = nQuadresHoritzontal * (costatRequadre + costatRequadre/2);
        int totalVertical = nQuadresVertical *(costatRequadre + costatRequadre/2);

        t.forward(-totalVertical/2);
        //t.turnLeft();
        //t.forward();
        for (int k = 0; k < nQuadresHoritzontal; k++) {
            dibuixaColumna(t,nQuadresVertical, costatRequadre);
            // Tornar al punt inicial
            anarALaSeguentColumna(t, nQuadresVertical, costatRequadre);
        }


        t.show();
    }

    private static void dibuixaColumna( Turtle t, int nQuadresVertical, int costatRequadre) {
        for (int j = 0; j < nQuadresVertical; j++) {
            dibuixaQuadrat(t, costatRequadre);
            t.setPenDown(false);
            t.forward(costatRequadre + costatRequadre / 2);
            t.setPenDown(true);
        }
    }

    private static void anarALaSeguentColumna(Turtle t, int nQuadresVertical, int costatRequadre) {
        t.setPenDown(false);
        t.forward(-nQuadresVertical*(costatRequadre + costatRequadre / 2));
        t.turnRight(90);
        t.setPenDown(false);
        t.forward(costatRequadre);
        t.setPenDown(true);
        t.turnLeft(90);
        t.setPenDown(true);
    }

    private static void dibuixaQuadrat(Turtle t,int costatRequadre) {
        for (int i = 0; i < 4; i++) {
            t.forward(costatRequadre);
            t.turnLeft(90); // pasam per parametres el objecte Turtle t
        }



    }
}
