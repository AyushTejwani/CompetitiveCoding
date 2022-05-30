import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class SarejaAndDima {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int total= scanner.nextInt();
        int[] array= new int[total];
        for(int i=0;i<total;i++)
        {
            array[i]= scanner.nextInt();
        }
        int sareja=0, dima=0;
        int left=0, right=total-1, chance=0;
        while(left<=right)
        {

            if(array[left]>array[right])
            {

                if(chance%2==0)
                    sareja=sareja+array[left];
                else
                    dima=dima+array[left];
                left++;
            }
            else
            {

                if(chance%2==0)
                    sareja=sareja+array[right];
                else
                    dima=dima+array[right];
                right--;
            }
            chance++;

        }
        System.out.print(sareja);
        System.out.print(" ");
        System.out.println(dima);
    }
}
