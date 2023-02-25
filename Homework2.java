import java.util.*;

public class Homework2 {
    public static void main(String[]argv){
        System.out.println("請輸入攝氏溫度:");
        Scanner myInput1 = new Scanner(System.in);
        int n = myInput1.nextInt();
        System.out.println("華氏溫度為:"+(n*9/5+32));
    }
}