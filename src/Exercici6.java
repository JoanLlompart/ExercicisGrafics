public class Exercici6 {
    public static void main(String[] args) {
        //6- Dibuixa el següent gràfic. Paràmetres: nombre de voltes de l'espiral i número de costats del
        //polígon de base.
        //t.setThicknees();
        Turtle t = new Turtle(800, 600);
        t.setDelay(500);
        int numVoltes = 23;
        int costatsBase =24;
        int logitutBase= 15;

        for (int i=0;i <= numVoltes;i++) {
            t.forward(logitutBase);
            t.turnRight(45);
            logitutBase = logitutBase + 5;


        }

        t.show();
    }
}
