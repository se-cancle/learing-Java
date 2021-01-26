import java.util.Arrays;

public class d1_231 {
    public static void main(String[] args){
//        给定一个整型数组, 实现冒泡排序(升序排序)
        int[] arr={9,3,5,7,6,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubblesort(int[] arr) {
        for(int bound=0;bound<arr.length;bound++){
            for(int cur= arr.length-1;cur>bound;cur--){
                if(arr[cur-1]<arr[cur]){
                    int tmp=arr[cur-1];
                    arr[cur-1]=arr[cur];
                    arr[cur]=tmp;
                }
            }
        }
    }
}
