import java.util.Arrays;

public class d1_234 {
    public static void main(String[] args){
//        实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
    int[] arr={1,2,3,4,5,6,7};
    int[] arr2=copyOf(arr);
   printArray(arr2);

    }

    public static void printArray(int[] arr2) {
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }

    public static int[] copyOf(int[] arr) {
        int[] result=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=arr[i];
        }
       return  result;
    }
}
