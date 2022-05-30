import java.util.*;

public class TechMahindra {
    public static int nonRepetitive(int N, int[] arr, int k)
    {
        int res=0;
        HashMap<Integer,Integer> storage= new HashMap<>();
        for(int i=0;i<N;i++)
        {
            if(storage.containsKey(arr[i]))
            {
                int temp= (int)storage.get(arr[i]);
                storage.put(arr[i],++temp);
            }
            else
            {
                storage.put(arr[i],1);
            }
        }
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            if((int)storage.get(arr[i])==1)
                result.add(arr[i]);
        }
        res= (int)result.get(k-1);
        return res;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int total= scanner.nextInt();
        int[] array= new int[total];
        for(int i=0;i<total;i++)
        {
            array[i]=scanner.nextInt();
        }
        int element=scanner.nextInt();

        int output= nonRepetitive(total, array, element);
        System.out.println("Answer:"+ output);
    }
}
