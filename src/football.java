import java.util.HashMap;
import java.util.Scanner;

public class football {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        HashMap<String, Integer> hashMap= new HashMap<>();
        for(int i=0;i<n;i++){
            String input= scanner.next();
            if(!hashMap.containsKey(input))
                hashMap.put(input,1);
            else{
                int temp= hashMap.get(input);
                temp++;
                hashMap.put(input,temp);
            }
        }
        int max=0;
        String ans="";
        for(HashMap.Entry<String,Integer> entry : hashMap.entrySet()){
            if(entry.getValue()>max){
                max= entry.getValue();
                ans= entry.getKey();
            }
        }
        System.out.println(ans);
    }
}
