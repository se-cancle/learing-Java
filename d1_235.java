import java.util.Arrays;

public class d1_235 {
    public static void main(String[] args){
//        实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(tostring(arr));
//            String result=toString(arr);
//            System.out.println(result);
        }
    public static String tostring(int[] arr) {
        String result="[";
        for(int i=0;i<arr.length;i++){
            result+=arr[i];
            if(i!=arr.length-1){
                result+=",";
            }
        }
       result+="]";
        return result;
    }
}


