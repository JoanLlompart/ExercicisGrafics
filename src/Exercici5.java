public class Exercici5 {
    public static void main(String[] args) {
        //5- Dibuixa el següent gràfic. Paràmetres: nombre de quadres concèntrics i longitud inicial del
        //quadre.
        Turtle t = new Turtle(800,600);

        int numQuadres = 1;
        int longQuadre = 20;

        t.setDelay(300);

        for (int c=0;c<=numQuadres;c++) {

            dibuixaQuadre(t, numQuadres, longQuadre);
            espaiQuadres(t, numQuadres, longQuadre);
            longQuadre=longQuadre + 10;
        }


        t.show();


    }

    private static void espaiQuadres(Turtle t,int numQuadres,int longQuadre) {
        t.setPenDown(false);
        for (int i=0;i <=4;i++) {//proba canvi de 4 a 8
            t.forward(longQuadre);
            t.turnRight(90);
        }
        t.turnRight(90); //proba

        t.setPenDown(true);
        t.markCursor();



    }

    private static void dibuixaQuadre(Turtle t,int numQuadres,int longQuadre) {
        for (int i=0;i <=4;i++) {
            t.forward(longQuadre);
            t.turnRight(90);
        }

    }
}
