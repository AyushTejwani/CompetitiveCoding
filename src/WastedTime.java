import java.util.Scanner;

public class WastedTime {
    public static double calculateDistance(double a,double b,double c, double d){
        return Math.sqrt(Math.pow(c-a,2)+Math.pow(d-b,2));
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int k= scanner.nextInt();

        double[][] pairs= new double[n][2];

        for(int i=0;i<pairs.length;i++){
            pairs[i][0]= scanner.nextInt();
            pairs[i][1]= scanner.nextInt();
        }
        double distance= 0;
        for(int i=0;i<pairs.length-1;i++){
           distance=distance+calculateDistance(pairs[i][0],pairs[i][1],pairs[i+1][0],pairs[i+1][1]);
        }
        System.out.println(String.format("%.9f",(distance*k)/50));
    }
}
