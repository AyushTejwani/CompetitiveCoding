import org.omg.CORBA.INTERNAL;

import java.util.Scanner;

public class BurglarAndMatches {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int canTake= scanner.nextInt();
        int containers= scanner.nextInt();
        int[] boxes= new int[containers];
        int[] matches= new int[containers];
        for(int i=0;i<containers;i++){
            boxes[i]=scanner.nextInt();
            matches[i]= scanner.nextInt();
        }
        int totalMatches=0;
        while(canTake>0){
            int max= Integer.MIN_VALUE,index=0;
            for(int i=0;i<containers;i++){
                if(matches[i]>max && boxes[i]!=0){
                    max= matches[i];
                    index=i;
                }
            }
            if(canTake>=boxes[index]){
                canTake=canTake-boxes[index];
                totalMatches= totalMatches+boxes[index] * matches[index];
                boxes[index]=0;
            }
            else {

                totalMatches = totalMatches + canTake * matches[index];
                canTake = 0;
            }
        }
        System.out.println(totalMatches);
    }
}
