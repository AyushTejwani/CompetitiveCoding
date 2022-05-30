import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input= scanner.next();
        String[] numbers= input.split("\\+");
        int[] arr= new int[numbers.length];
        for(int i=0;i<numbers.length;i++)
        {
            arr[i]= Integer.parseInt(numbers[i]);
        }
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            if(i==arr.length-1)
            {
                return;
            }
            System.out.print("+");
        }

    }
}
