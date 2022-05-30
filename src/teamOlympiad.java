import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class teamOlympiad {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number= scanner.nextInt();
        List<Integer> maths= new ArrayList<Integer>();
        List<Integer> programmer= new ArrayList<Integer>();
        List<Integer> physcial= new ArrayList<Integer>();
        for(int i=0;i<number;i++)
        {
            int n= scanner.nextInt();
            if(n==1){
                maths.add(i);
            }
            else if(n==2){
                programmer.add(i);
            }
            else{
                physcial.add(i);
            }
        }
        int size=1000;
        if(maths.size()<=programmer.size() && maths.size()<=physcial.size())
        {
            size=maths.size();
        }
        else if(programmer.size()<=maths.size() && programmer.size()<=physcial.size()){
            size=programmer.size();
        }
        else{
            size=physcial.size();
        }
        for(int i=0;i<size;i++){
            System.out.print(maths.get(i));
            System.out.print(" ");
            System.out.print(programmer.get(i));
            System.out.print(" ");
            System.out.println(physcial.get(i));
        }

    }
}
