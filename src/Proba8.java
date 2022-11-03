public class Proba8 {
    public static void main(String[] args) {
        Turtle t = new Turtle(800,600);


        dibuixaDosTriangles(t,200);
        t.turnRight(90);
        dibuixaDosTriangles(t,200);
        t.show();
    }

    private static void dibuixaDosTriangles(Turtle t,int costat) {

        t.turnLeft(30);
        t.forward(costat);
        t.turnRight(120);
        t.forward(costat);
        t.turnRight(120);
        t.forward(costat*2);
        t.turnLeft(120);
        t.forward(costat);
        t.turnLeft(120);
        t.forward(costat);
        t.turnRight(30);


    }
}
