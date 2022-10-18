public class Main {
    public static void main(String[] args) {
        Object[] objs = {new Circle(5), new Rectange(100,500), new Square(250)};
        Circle circle = (Circle) objs[0];
        Rectange rectange = (Rectange) objs[1];
        Square square = (Square) objs[2];

        int[] resizes = {100, 400, 500};
        circle.resize(resizes[0]);
        rectange.resize(resizes[1]);
        square.resize(resizes[2]);
        for(int i=0; i<objs.length; i++){
            System.out.println(objs[i]);
        }

    }
}