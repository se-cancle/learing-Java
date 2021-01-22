import java.util.Arrays;

public class d1_22 {
    public static void main(String[] args ){
        //  调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    int[] arr = {1, 2, 3, 4, 5, 6};
    transform(arr);
    System.out.println(Arrays.toString(arr));
}
 public static void transform(int[] arr){
     int left=0;
     int right=arr.length-1;
     while(left<right){
         while(left<right&&arr[left]%2!=0){
             left++;
         }
         while(left<right&&arr[right]%2==0){
             right--;
         }
         int tmp=arr[left];
         arr[left]=arr[right];
         arr[right]=tmp;
     }
 }
}
