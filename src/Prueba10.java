public class Prueba10 {
    /*
    public static void main(String[] args) {
        Turtle t = new Turtle(800, 600);

        int diametre = (int) (360.0 / Math.PI);
        t.forward(diametre);

        t.turnRight(90);
        for (int i = 0; i <90; i++) {
            t.turnRight(1);
            t.forward(1);
        }

        t.turnRight(90);
        t.forward(diametre);

        t.turnLeft(90);
        for (int i = 0; i <90; i++) {
            t.turnLeft(1);
            t.forward(1);
        }

        t.show();
    }

     */

    public static void main(String[] args) {
        Turtle t = new Turtle(800, 600);

        //10- Dibuixa el següent gràfic.

        int circulo = 2;
        int vegadesCercle = 80;
        int recta = 300;


        //for (int i = 0; i <= 1; i++) {

        //dibuixarCercleDreta(t, circulo, vegadesCercle);
        dibuixarLineas(t, recta);
        //dibuixarCercleEsquerra(t, circulo, vegadesCercle);



        //dibuixarCercle(t, circulo, vegadesCercle);
        //}
        t.show();
    }
    private static void dibuixarCercleEsquerra(Turtle t, int circulo, int vegadesCercle) {
        for (int e=0;e <=vegadesCercle;e++) {
            t.turnLeft(1);
            t.forward(circulo);
        }
    }
    private static void dibuixarLineas(Turtle t,int recta) {
        //t.turnRight(180);
        t.forward(recta);
        t.turnRight(180);
        t.forward(recta/2);
        t.turnRight(90);
        t.forward(recta);
    }
    private static void dibuixarCercleDreta(Turtle t, int circulo, int vegadesCercle) {
        for (int c = 0;c<=vegadesCercle;c++) {
            t.turnRight(1);
            t.forward(circulo);
        }
    }
}


