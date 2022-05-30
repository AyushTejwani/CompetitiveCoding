import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juicer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfOranges=scanner.nextInt();
        int maxSizeOfOrange=scanner.nextInt();
        int maxSizeOfCollector=scanner.nextInt();
        int[] oranges= new int[numberOfOranges];
        for(int i=0;i<numberOfOranges;i++)
        {
            oranges[i]=scanner.nextInt();
        }
        int sum=0,counter=0;
        for(int i=0;i<numberOfOranges;i++){
         if(oranges[i]>maxSizeOfOrange)
             continue;
         sum=sum+oranges[i];
         if(sum>maxSizeOfCollector)
         {
             counter++;
             sum=0;
         }
        }
        System.out.println(counter);
    }
}
