import java.util.Scanner;

public class solve {
    public static boolean allOnes(int[] systemState)
    {
        boolean check=true;
        for(int i=0;i<systemState.length;i++)
        {
            if(systemState[i]==0)
                check=false;
        }
        return check;
    }
    public static int minLength(int[] systemState, int[] dist)
    {
        int answer=0;
        int[] diff=new int[dist.length];
        diff[0]=0;
        for(int i=1;i<diff.length;i++)
        {
            diff[i]=dist[i]-dist[i-1];
        }
        int count=0;
        while(allOnes(systemState)) {
            for (int i = 0; i < systemState.length; i++) {
                int less;
                if (systemState[i] == 1 && systemState[i - 1] == 0 && systemState[i + 1] == 0) {
                    if (diff[i] > diff[i + 1]) {
                        systemState[i - 1] = 1;
                        answer = answer + diff[i + 1];
                    } else {
                        systemState[i + 1] = 1;
                        answer = answer + diff[i - 1];
                    }
                } else if (systemState[i] == 1 && systemState[i - 1] == 0 && systemState[i + 1] == 1) {
                    systemState[i - 1] = 1;
                    answer = answer + diff[i - 1];
                } else if (systemState[i] == 1 && systemState[i - 1] == 1 && systemState[i + 1] == 0) {
                    systemState[i + 1] = 1;
                    answer = answer + diff[i + 1];
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int total= scanner.nextInt();
        int[] state= new int[total];
        for(int i=0;i<total;i++)
            state[i]=scanner.nextInt();
        int dist=scanner.nextInt();
        int[] dis= new int[dist];
        for(int i=0;i<dist;i++)
            dis[i]=scanner.nextInt();
        System.out.println(minLength(state, dis));
    }
}
