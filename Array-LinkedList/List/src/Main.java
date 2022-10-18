import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();

        for(int i=0; i<11; i++){
            list.add(i);
        }
        for(int i=0; i<11; i++){
            System.out.println(list.get(i));
        }
        list.get(-1);
        System.out.println("element -1: " + list.get(-1));
    }
}