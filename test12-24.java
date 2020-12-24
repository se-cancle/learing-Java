public class test {
    public static void main(String[] args){
    //二进制1的个数
    int num=BitOneCount(8);
    System.out.println(num);
    }
    public static int BitOneCount(int n) {
        int count=0;
        for(int i=0;i<32;i++){
            if((n&(1<<i))!=0){
                count++;
            }
        }
        return count;
    }

//    public static int BitOneCount(int i) {
//        int count=0;
//        while(i!=0){
//            if(i%2!=0){
//                count++;
//            }
//            i=i/2;
//        }
//        return count;
//    }

}
