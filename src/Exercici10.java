public class Exercici10 {
    public static void main(String[] args) {
        Turtle t = new Turtle(800, 600);

        //10- Dibuixa el següent gràfic.

        int circulo = 1;
        int vegadesCercle = 100;
        int recta = 200;

        //t.setDelay(50);

        for (int i = 0; i <= 1; i++) {
            dibuixarCercle(t, circulo, vegadesCercle);
            dibuixarLineas(t, recta);
    }
        t.show();
    }

    private static void dibuixarLineas(Turtle t,int recta) {

        t.turnLeft(80);
        t.forward(recta);
        //t.turnRight(80);
       //t.forward(recta/2);


    }

    private static void dibuixarCercle(Turtle t,int circulo,int vegadesCercle) {
        for (int c = 0;c<=vegadesCercle;c++) {
            t.turnLeft(1);
            t.forward(circulo);
        }

    }
}
