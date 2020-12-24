import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ResultTreeType;

import java.util.Scanner;

public class test {
    // 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
    public static void main(String[] args) {
//        double result=seriesSum(100);
//        System.out.println(result);
        //求两个正整数的最大公约数
//    int result=calcGreatstCommonDivisor(100,120);
//    System.out.println(result);
        //二进制1的个数。
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入数字:");
//        int n= scanner.nextInt();
        int num=BitOneCount(10);
        System.out.println(num);

    }

    public static int BitOneCount(int n) {

      //  int m=scanner.nextInt();
        int count=0;
        while(n!=0){
            if(n%2!=0){
                count++;
            }
            count=count/2;
        }
        return count;

    }

//    public static int calcGreatstCommonDivisor(int a, int b) {
//        int min=min(a,b);
//        for(int i=min;i>1;i--){
//            if(a%i==0&&b%i==0){
//                return i;
//            }
//        }
//        return 1;
//    }

//    public static int min(int a, int b) {
//        if(a>b){
//            return a;
//        }else{
//            return b;
//        }
//    }
}
//    private static double seriesSum(int i) {
//        double sum=0.0;
//        for(int n=1;n<=i;n+=2){
//            sum+=calcItem(n);
//        }
//        return sum;
//    }
//    private static double calcItem(int n) {
//        return 1/n-1/(n+1);
//    }
//}
