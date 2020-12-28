import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ResultTreeType;

public class d1228 {
    public static void main(String[] args){
//        int result=add(10,20);
//        System.out.println(result);
//        double result1=add(10.2,20.3,30.5);
//        System.out.println(result1);
// 在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
//       int result=max(10,20);
//       System.out.println(result);

//       int result1=min(10,20);
//       System.out.println(result1);
//
//        double  result2=max(10,20,30.5);
//        System.out.println(result2);
//
//        double  result3=min(10,20,30.5);
//        System.out.println(result3);
        //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
        // 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
        int result=max2(10,20);
        System.out.println(result);

        int  result2=max3(10,20,30);
        System.out.println(result2);
    }

    public static int max3(int a, int b, int c) {
          return max2(max2(a,b),c);
    }

    public static int max2(int a, int b) {
        if(a>b){
            return a;
        }else{
            return b;
        }



//    public static double min(int a, int b, double c) {
//        if(a<b&&a<c){
//            return a;
//        }else if(b<c && b<a){
//            return b;
//        }else {
//            return c;
//        }
//    }
//
//    public static double max(int a, int b, double c) {
//        if(a>b&&a>c){
//            return a;
//         }else if(b>c && b>a){
//                return b;
//          }else {
//               return c;
//            }
//        }
//
//
//
//    public static int min(int a, int b) {
//        if(a>b){
//            return b;
//        }else{
//            return a;
//        }
//    }

//    public static int max(int a, int b) {
//        if(a>b){
//            return a;
//        }else{
//            return b;
//        }


    }

//    public static int add(int a, int b) {
//        return a+b;
//    }
//    public static double add(double a,double b,double c){
//        return a+b+c;
//    }
}
