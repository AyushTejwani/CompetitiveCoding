import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int total= scanner.nextInt();
        int[] array= new int[total];
        int sum=0;
        for(int j=0;j<total;j++){
            array[j]= scanner.nextInt();
            sum=sum+array[j];
        }
        int middle= sum/2+1;
        Arrays.sort(array);
        int ans=0, c=0;
        int index=array.length-1;
        while(ans<middle && index>=0){
            ans=ans+array[index];
            index--;
            c++;
        }
        System.out.println(c);

    }
}
