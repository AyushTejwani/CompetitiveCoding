import java.util.HashMap;
import java.util.Scanner;

public class antonAndPolyhedron {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        HashMap<String, Integer> hs= new HashMap<>();

        hs.put("Tetrahedron",4);
        hs.put("Cube",6);
        hs.put("Octahedron",8);
        hs.put("Dodecahedron",12);
        hs.put("Icosahedron",20);
        int total=0;
        for(int i=0;i<n;i++){
            String input= scanner.next();
            total= total+ hs.get(input);
        }
        System.out.println(total);
    }
}

