import java.util.Scanner;

public class ShaassAndoskols {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int[] birdOnLanes=new int[rows];
        for(int i=0;i<rows;i++)
        {
            birdOnLanes[i]=scanner.nextInt();
        }
        int shots= scanner.nextInt();
        for(int i=0;i<shots;i++)
        {
            int rowth=scanner.nextInt();
            int ith=scanner.nextInt();
            int totalBirds= birdOnLanes[rowth-1];
            int down= ith-1;
            int up= totalBirds-ith;
            if(rowth<rows)
                birdOnLanes[rowth]= birdOnLanes[rowth]+up;
            if(rowth-2>=0)
                birdOnLanes[rowth-2]= birdOnLanes[rowth-2]+down;
            birdOnLanes[rowth-1]=0;
            }
        for(int j=0;j<rows;j++)
        {
            System.out.println(birdOnLanes[j]);
        }
    }
}
