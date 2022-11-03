public class Exercici10 {
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

}
