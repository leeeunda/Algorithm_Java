import java.util.*;

public class Main{
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);

        int N = in.nextInt();
        int[] Array= new int[N];
        
        for (int i=0; i<N; i++){
            Array[i] = in.nextInt();
        }

        Arrays.sort(Array);

        int min= Array[0];
        int max=Array[N-1];

        System.out.println(min*max);
    }

}
