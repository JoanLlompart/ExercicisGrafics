public class Exercici8 {
    public static void main(String[] args) {
        Turtle t = new Turtle(800,600);
        //8- Dibuixa el següent gràfic.
        int longTriangle = 100;
        int angleGir = 120;

        dibuixaTriangle(t,longTriangle,angleGir);






        t.show();




    }

    private static void dibuixaTriangle(Turtle t,int longTriangle,int angleGir) {
        t.turnRight(90);
        t.forward(longTriangle);
        t.turnRight(angleGir);
        t.forward(longTriangle);
        t.turnRight(120);
        t.forward(longTriangle);
    }
}
