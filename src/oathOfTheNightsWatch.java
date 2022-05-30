import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class oathOfTheNightsWatch {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int size= scanner.nextInt();
        int[] array= new int[size];
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }
        Arrays.sort(array);
        int count=0;
        for (int j : array) {
            if (j == array[0] || j == array[array.length-1])
                continue;
            count++;
        }
        System.out.println(count);
    }
}
