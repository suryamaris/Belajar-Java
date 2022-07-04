package fibbonacci;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Inputkan nilai : ");
        int nilai = userInput.nextInt();

        for (int i=0; i<nilai; i++){
            System.out.print(fibbonacci(i)+" ");
        }
    }

    public static int  fibbonacci(int nilai) {
        int n;
        if (nilai == 0 || nilai == 1)
            return nilai;
        else
            return (fibbonacci(nilai - 1) + fibbonacci(nilai - 2));
    }
}
