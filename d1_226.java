public class d1_226 {
    public static void main(String[] args){
//        实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
    int[] arr={1,2,3};
    int[] arr1=transform(arr);
    PrntArray(arr1);
    }
    public static void PrntArray(int[] arr1) {
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
    public static int[] transform(int[] arr) {
        int[] arr1=new int[arr.length];
        for(int i=0;i<arr.length;i++){
          arr1[i]=arr[i]*2;
        }
        return arr1;
    }
}
