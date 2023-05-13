import java.util.HashSet;
import java.util.Scanner;

public class goosNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int k= scanner.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        HashSet<Integer> hs= new HashSet();
        HashSet<Integer> hs1= new HashSet();
        for(int a=0;a<=k;a++){
            hs.add(a);
        }
       int count=arr.length;
        for(int i=0;i<arr.length;i++){
            int number= arr[i];
            while(number!=0){
                int checker= number%10;
                number= number/10;
                if(!hs.contains(checker)){
                    count=count-1;
                    break;
                }

                hs1.add(checker);
            }
            if(hs.size()!=hs.size()){
                count=count-1;
            }
        }
        System.out.println(count);
    }
}
