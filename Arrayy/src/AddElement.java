import java.sql.SQLOutput;
import java.util.Scanner;
public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = scanner.nextInt();
        System.out.println("Input index: ");
        int index = scanner.nextInt();

        addElement(number, index);
    }
    public static void addElement(int number, int index){
        int[] array = {10,4,6,7,8,0,0,0,0,0};
        int[] arrayClone = array.clone();


        for(int i=index; i<arrayClone.length-1; i++){
            arrayClone[i+1] = array[i];
        }

        arrayClone[index] = number;

        for(int i=0; i<array.length; i++){
            if(i == array.length-1){
                System.out.print(array[i]);
            }else{
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("");
        for(int i=0; i<arrayClone.length; i++){
            if(i == arrayClone.length-1){
                System.out.print(arrayClone[i]);
            }else{
                System.out.print(arrayClone[i] + ", ");
            }
        }
    }
}
