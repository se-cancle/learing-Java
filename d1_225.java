public class d1_225 {
    public static void main(String[] args){
//        实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
        int[] arr={1,2,4,3,6,7,9};
        int result=sum(arr);
        System.out.println(result);
    }

    public static int sum(int[] arr) {
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        return sum;
    }
}
