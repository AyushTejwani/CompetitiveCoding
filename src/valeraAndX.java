import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class valeraAndX {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        HashSet<String> diag= new HashSet<>();
        HashSet<String> nondiag= new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    diag.add(scanner.next());
                }
                else {
                    nondiag.add(scanner.next());
                }
            }
        }
        if(diag.size()==1 && nondiag.size()==1 && !diag.equals(nondiag)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
