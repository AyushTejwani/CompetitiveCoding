import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class IsYourHorseShoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<4;i++)
        {
            hs.add(scanner.nextInt());
        }
        System.out.println(4-hs.size());
    }
}
