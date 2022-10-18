public class Square extends Rectange{
    public Square(){

    }
    public Square(double size){
        super(size, size);
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
