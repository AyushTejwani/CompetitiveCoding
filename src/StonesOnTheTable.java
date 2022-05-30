import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int letters= scanner.nextInt();
        String stones= scanner.next();
        String stone=stones.substring(0,1);
        int remove=0;
        for(int i=1;i<letters;i++)
        {
            if(stone.equals(stones.substring(i,i+1)))
            {
                remove++;
            }
            else
            {
                stone=stones.substring(i,i+1);
            }
        }
        System.out.println(remove);
    }
}
