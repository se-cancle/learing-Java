import java.util.Scanner;

public class d1_222 {
    public static void main(String[] args){
//        求1！+2！+3！+4！+........+n!的和
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int result=0;
        for(int num=1;num<=n;num++){
            int tmp=1;
            for(int i=1;i<=num;i++){
                tmp*=i;
            }
            result+=tmp;
        }
        System.out.println(result);




//        求 N 的阶乘 。
//        Scanner scanner=new Scanner(System.in);
//        int n= scanner.nextInt();
//        int result=1;
//        for(int num=1;num<=n;num++){
//            result*=num;
//        }
//        System.out.println(result);


    }
}
