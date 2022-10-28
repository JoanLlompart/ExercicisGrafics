public class Exercici2 {
    public static void main(String[] args) {
        // 2- Dibuixa el següent gràfic. Paràmetres: número d'escalons, píxels totals en vertical i píxels totals
        //en horitzontal.
        Turtle t = new Turtle(800, 600);

        int escalons = 4;
        int tVerticals = 50;
        int tHorizontals = 30;

            //dibuixaEscalo(t,tVerticals,tHorizontals,escalons);
            baixaEscalo(t,tVerticals,tHorizontals,escalons);
            lineaRecta(t);
            pujaEscalo(t,tVerticals,tHorizontals,escalons);

        t.show();
    }
    private static void pujaEscalo(Turtle t,int tVerticals,int tHoritzontals,int escalons) {
        t.turnLeft(90);

        for (int k =0;k<= escalons;k++) {
            t.forward(tVerticals);
            t.turnRight(90);
            t.forward(tHoritzontals);
            t.turnLeft(90);
        }
    }

    private static void lineaRecta(Turtle t) {
        t.forward(40);
    }

    private static void baixaEscalo(Turtle t, int tVerticals, int tHorizontals , int escalons) {
        t.turnRight(90);
        for(int j = 0; j <= escalons;j++) {
            t.forward(tHorizontals);
            t.turnRight(90);
            //t.markCursor();
            t.forward(tVerticals);
            t.turnLeft(90);
        }
    }
}