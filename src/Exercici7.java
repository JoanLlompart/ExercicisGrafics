public class Exercici7 {
    public static void main(String[] args) {
        Turtle t = new Turtle(800, 600);
        int nFulles = 15;
        double delta = 360d / nFulles;

        double angle = 0;
        for (int i = 0; i < nFulles; i++) {
            t.resetAngle();
            t.turnRight((int) angle);
            dibuixaFulla(t);
            angle += delta;
        }
        t.show();
    }

    private static void dibuixaFulla(Turtle t) {
        mitjaFulla(t, 1);
        t.turnRight(90);
        mitjaFulla(t, 1);
    }

    private static void mitjaFulla(Turtle t, int angle) {
        for (int i = 0; i < 90; i++) {
            t.forward(2);
            t.turnRight(angle);
        }
    }
}

