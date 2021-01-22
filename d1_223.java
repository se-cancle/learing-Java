public class d1_223 {
    public static void main(String[] args) {
//        有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
        int[] arr={1,1,2,2,5,5,3,6,6,4,4};
        int i=0;
        int j=0;
        int count;
        for(i=0;i<arr.length;i++){
             count=0;
            for(j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                 count++;
                }
             }
            if(count==1){
                System.out.println(arr[i]);
            }
        }
    }
}
