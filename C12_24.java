import java.util.Scanner;

public class C12_24 {
    public static void main(String[] args) {
        //一个数二进制序列奇数位和偶数位
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        //奇数位
        for(int i=31;i>=1;i-=2){
            System.out.print((n>>i)&1);
        }
        System.out.println();
        //偶数位
        for(int i=30;i>=0;i-=2){
            System.out.print((n>>i)&1);
        }
// 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
//    inputPassword();
        //输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        PrintfNum(n);


    }

//    public static void PrintfNum(int n) {
//        if(n>9){
//            PrintfNum(n/10);
//        }
//       System.out.println(n%10);
//     }
//        for (int row = 1; row <= 9; row++) {
//            printLine(row);
//        }
   }

//    public static void printLine(int row) {
//        for (int col = 1; col <= row; col++) {
//            System.out.printf("%dx%d=%d ", col, row, row * col);
//        }
//        System.out.println();
//    }
//}


//    public static void inputPassword() {
//        String password="123456";
//        Scanner scanner=new Scanner(System.in);
//        int i=0;
//        for(;i<3;i++){
//            System.out.println("请输入密码：");
//            String input=scanner.next();
//            if(input.equals(password)){
//                System.out.println("密码正确，登陆成功");
//                break;
//            }else{
//                System.out.println("密码错误，请重新输入");
//            }
//        }
//        if(i==3){
//            System.out.println("您已经连续失败3次，系统强制退出");
//        }
//    }
//}
