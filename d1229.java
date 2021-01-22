import static netscape.security.Privilege.add;

public class d1229 {
    public static void main(String[] args){
        int result1=max(10,20);
        System.out.println(result1);

        int result2=min(10,20);
        System.out.println(result2);

        double result3=max(10,20,30.5);
        System.out.println(result3);

        double result4=min(10,20,30.5);
        System.out.println(result4);

        int result=add(10,20);
        System.out.println(result);
        double result5=add(10.2,20.3,30.5);
        System.out.println(result1);



      }


        public static int add(int a, int b) {
        return a+b;
    }
    public static double add(double a,double b,double c){
        return a+b+c;
    }

    public static double min(int a, int b, double c) {
        if(a<b&&a<c){
            return a;
        }else if(b<a&&b<c){
            return b;
        }else{
            return c;
        }
    }

    public static double max(int a, int b, double c) {
        if(a>b&&a>c){
            return a;
         }else if(b>a&&b>c){
            return b;
        }else{
            return c;
        }

}

    public static int min(int a, int b) {
        if(a<b){
            return a;
        }else{
            return b;
        }
    }

    public static int max(int a, int b) {
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
