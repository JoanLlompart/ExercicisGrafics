public class Exercici8 {
    public static void main(String[] args) {
        Turtle t = new Turtle(800,600);
        //8- Dibuixa el següent gràfic.
        int longTriangle = 80;
        int angleGir = 120;
        int numTriangles =4;

        for (int i = 0;i<= numTriangles;i++) {
            dibuixaTriangle(t, longTriangle, angleGir);
        }
        t.show();
    }
    private static void espaiEntreTriangles(Turtle t,int longTriangle,int angleGir) {
        t.setPenDown(false);
        t.turnLeft(angleGir);
        t.forward(longTriangle/2);
        t.turnLeft(angleGir);
        t.forward(longTriangle/2);

        t.turnLeft(180);
        t.markCursor();
        t.forward(90);
        t.turnRight(90);
        t.setPenDown(true);
    }
    private static void dibuixaTriangle(Turtle t,int longTriangle,int angleGir) {
        t.turnRight(30);
        t.forward(longTriangle);
        t.turnRight(angleGir);
        t.forward(longTriangle);
        t.turnRight(120);
        t.forward(longTriangle);
    }
}
