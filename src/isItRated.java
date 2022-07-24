import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class isItRated {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int[] arr1= new int[n];int[] arr2= new int[n];
        boolean maybe= false;
        HashMap<Integer, Integer> hs= new HashMap<>();
        for(int i=0;i<n;i++){
            arr1[i]=scanner.nextInt();
            arr2[i]=scanner.nextInt();
            if(arr1[i]!=arr2[i]){
                System.out.println("rated");
                return;
            }
            if(hs.containsKey(arr1[i]) && hs.get(arr1[i]).equals(arr2[i])){
                maybe=true;
            }
            else{
            hs.put(arr1[i],arr2[i]);
            }
        }
        if(maybe)
        {
            System.out.println("maybe");
        }
        else{
            System.out.println("unrated");
        }

    }
}
