public class Estrella {
    public static void main(String[] args) {
        Turtle t = new Turtle(800,600);
        //8- Dibuixa el següent gràfic.
        int longTriangle = 100;
        int angleGir = 120;
        int numTriangles =5;

        for (int i = 0;i<= numTriangles;i++) {
            dibuixaTriangle(t, longTriangle, angleGir);
            espaiEntreTriangles(t, longTriangle, angleGir);

        }






        t.show();




    }

    private static void espaiEntreTriangles(Turtle t,int longTriangle,int angleGir) {
        t.setPenDown(false);
        t.turnLeft(angleGir);
        t.forward(50);
        t.turnLeft(90);
        t.forward(90);

        t.turnLeft(180);
        t.forward(90);
        t.setPenDown(true);
        //t.markCursor();




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


