public class Exercici9 {
    public static void main(String[] args) {
        Turtle t =new Turtle(800,600);
        //9- Dibuixa el següent gràfic. Paràmetres: longitud de costat i número de triangles.

        int longCostat = 110;
        int numTriangles=9;
        int longBase =110;

        for (int i =0;i <=numTriangles;i++){
            ferTriangle(t,numTriangles,longCostat,longBase);

        }


        t.show();
    }

    private static void ferTriangle(Turtle t,int numTriangle,int longCostat,int longBase) {

        t.turnRight(130);
        t.forward(longBase);
        t.turnRight(120);
        t.forward(longCostat);
        t.turnRight(120);
        t.forward(longCostat);
        t.turnLeft(70);



    }

}
