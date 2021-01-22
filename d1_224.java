public class d1_224 {
    public static void main(String[] args){
//        实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
        int[] arr={1,2,3,4,8,6};
        double result=avg(arr);
        System.out.println(result);
    }

    public static double avg(int[] arr) {
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        return (double)sum/arr.length;
    }
}
