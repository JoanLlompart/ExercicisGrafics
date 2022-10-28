public class Exercici3 {
    public static void main(String[] args) {
        Turtle t = new Turtle(800, 600);
/*
 public static void main(String[] args) {
        Turtle t = new Turtle(800, 600);

        int constatRequadre = 20;
        int nQuadreHorizontal = 6;
        int nQuadresVertical = 8;

        for (int k = 0; k < nQuadreHorizontal; k++){
            for ( int j = 0; j < nQuadresVertical; j++){
                for (int i = 0; i < 4; i++) {
                    t.forward(constatRequadre);
                    t.turnLeft(90);
                    t.forward(constatRequadre);
                }
                t.forward(constatRequadre);
            }
            //Tornar al punt inicial
            t.forward(-nQuadresVertical*constatRequadre);
            t.turnRight(90);
            t.setPenDown(false);
            t.forward(constatRequadre);
            t.setPenDown(true);
            t.turnLeft(90);

        }
        t.show();
    }
}
 */
        int costatRequadre = 30;
        int nQuadresHoritzontal = 6;
        int nQuadresVertical = 8;

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
            t.forward(costatRequadre);
        }
    }

    private static void anarALaSeguentColumna(Turtle t, int nQuadresVertical, int costatRequadre) {
        t.forward(-nQuadresVertical*costatRequadre);
        t.turnRight(90);
        t.setPenDown(false);
        t.forward(costatRequadre);
        t.setPenDown(true);
        t.turnLeft(90);
    }

    private static void dibuixaQuadrat(Turtle t,int costatRequadre) {
        for (int i = 0; i < 4; i++) {
            t.forward(costatRequadre);
            t.turnLeft(90); // pasam per parametres el objecte Turtle t
        }

    }

}
