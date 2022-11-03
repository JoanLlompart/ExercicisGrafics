public class Exercici5 {
    public static void main(String[] args) {
        //5- Dibuixa el següent gràfic. Paràmetres: nombre de quadres concèntrics i longitud inicial del
        //quadre.
        Turtle t = new Turtle(500,500);

        int numQuadres = 10;
        int longQuadre = 20;
        t.setDelay(200);

        for (int c=0;c<=numQuadres;c++) {

            dibuixaQuadre(t,longQuadre);
            espaiQuadres(t,longQuadre);

            longQuadre=longQuadre + 40;
        }


        t.show();


    }

    private static void espaiQuadres(Turtle t,int longQuadre) {
        t.setPenDown(false);
        //t.goTo(0,0);
        t.turnRight(90);
        t.forward(longQuadre +20);
        t.turnRight(90);
        t.forward(20);
        t.turnRight(90);

        //for (int i=0;i <=4;i++) {//proba canvi de 4 a 8
           // t.forward(longQuadre);
           // t.turnRight(90);
        //}
         //proba
        t.setPenDown(true);



    }

    private static void dibuixaQuadre(Turtle t,int longQuadre) {
        for (int i=0;i <=4;i++) {
            t.forward(longQuadre);
            t.turnRight(90);
        }

        //t.markCursor();


    }
}
