import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows= scanner.nextInt();
        int[] arr= new int[rows];
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<2;j++)
            {
                if(j==0)
                    arr[i]=scanner.nextInt();
                else
                {
                    int temp=scanner.nextInt();
                    if(hs.containsKey(temp))
                    {
                        int a=(int)hs.get(temp);
                        a++;
                        hs.put(temp,a);
                    }
                    else
                    {
                        hs.put(temp,1);
                    }

                }
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(hs.containsKey(arr[i]))
            {
                count=count+(int)hs.get(arr[i]);
            }
        }
        System.out.println(count);
    }
}
