import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qualys {
    public static long calculateAmount(List<Integer> prices)
    {
        if(prices.size()==0)
            return 0;
        long sum=prices.get(0);
        int min=prices.get(0);
        for(int i=1;i<prices.size();i++)
        {
            sum=sum+Integer.max(0,prices.get(i)-(int)min);
            if(prices.get(i)<min)
            min=prices.get(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int total= scanner.nextInt();

        ArrayList<Integer> prices= new ArrayList<Integer>();
        for(int i=0;i<total;i++)
        {
            int temp= scanner.nextInt();
            prices.add((Integer) temp);
        }
//        System.out.println(prices);
//        for(int i=0;i<prices.size();i++)
//        {
//            System.out.println(prices.get(i));
//        }
        long result=calculateAmount(prices);
        System.out.println(result);
    }
}
