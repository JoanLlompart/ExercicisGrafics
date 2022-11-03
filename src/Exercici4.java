public class Exercici4 {
    public static void main(String[] args) {
        Turtle t = new Turtle(800, 600);
        //girar 135º per arbre
        // h=√2*c hipotenusa
//Dibuixa el següent gràfic. Paràmetres: número de «fulles», longitud de la fulla.

        int numFulles = 3;
        int longitutFulla =40;
        int tronc = 30;
        int girFulla =130;

        dibuixaTronc(t,numFulles,longitutFulla,tronc);
        dibuixarFullaDreta(t ,numFulles,longitutFulla,girFulla);
        dibuixCap(t ,numFulles,longitutFulla,girFulla);
        dibuixarFullaEsq(t ,numFulles,longitutFulla,girFulla);
        t.show();
    }

    private static void dibuixCap(Turtle t, int numFulles, int longitutFulla,int girFulla) {
        int longCap = longitutFulla -20;
        t.setPenDown(false);
        t.turnLeft(girFulla);
        t.setPenDown(true);

        t.forward(longCap);

        t.markCursor();
    }

    private static void dibuixarFullaEsq(Turtle t, int numFulles, int longitutFulla, int girFulla) {
        t.goTo(0,30);
        t.turnRight(400);
        t.turnLeft(90);
        for (int d =0;d <=numFulles;d++) {

            t.forward(longitutFulla);
            t.turnRight(girFulla);
            t.forward(60);
            t.turnLeft(girFulla);
        }
    }

    private static void dibuixarFullaDreta(Turtle t, int numFulles, int longitutFulla, int girFulla) {

        t.turnRight(90);
        for (int i = 0; i <=numFulles; i++) {
            int inclinada = 60;

            t.forward(longitutFulla);
            t.turnLeft(girFulla);
            t.forward(inclinada);
            t.turnRight(girFulla);
        }
    }

    private static void dibuixaTronc(Turtle t, int numFulles, int longitutFulla, int tronc) {
        t.forward(tronc);
        t.setPenDown(false);
        t.turnRight(90);
        t.forward(30);
        t.setPenDown(true);
        t.turnRight(90);
        t.forward(tronc);
        t.setPenDown(false);
        t.turnRight(180);
        t.forward(tronc);
        t.setPenDown(true);
    }
}
