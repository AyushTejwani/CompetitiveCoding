import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int totalGifts= scanner.nextInt();
        int[] indexReceivedGiftFrom= new int[totalGifts];
        int[] indexSentGiftFrom= new int[totalGifts];

        for(int i=0;i<indexReceivedGiftFrom.length;i++)
        {
            indexReceivedGiftFrom[i]= scanner.nextInt();
        }
        for(int i=0;i<indexSentGiftFrom.length;i++)
        {
           indexSentGiftFrom[indexReceivedGiftFrom[i]-1]=i+1;
        }
        for(int i=0;i<indexSentGiftFrom.length;i++)
        {
            System.out.print(indexSentGiftFrom[i]);  System.out.print(" ");
        }
    }
}
