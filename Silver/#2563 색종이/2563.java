import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt() //int를 입력받으므로 Scanner 클래스의 nextInt 메서드 사용-> 색종이의 개수 N
        int [][] arr=new int[100][100] //흰색 도화지-> 2차원 배열 이용

        int count=0;
        for (int i=0;i<N;i++){
            int X=sc.nextInt(); //색종이를 붙인 위치 x,y좌표 설정
            int Y=sc.netInt();

            for (int a=X;a<X+10;a++){
                for (int b=Y; b<Y+10;b++) arr[a][b]=1; //색종이의 면적을 1로 표현
            }
        }

        for(int i=0;i<100;i++){
            for (int j=0;j<100;j++){
                if (arr[i][j]==1) count++ //색종이가 붙어있다면 count변수를 증가시켜서 면적을 ㄱ후ㅏㄴ다
            }
        }
        System.out.println(count;)
    }
}
