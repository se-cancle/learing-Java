public class d1_232 {
    public static void main(String[] args){
//        给定一个整型数组, 判定数组是否有序（递增）
        int[] arr={1,3,4,6,2,7};
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
