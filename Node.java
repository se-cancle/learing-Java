public class Node {
    public int val;
    public Node next=null;
    public Node(int val){
        this.val=val;
    }

    @Override
    public String toString() {
        return "[" + val + "]";
    }
}
//    private String[] data=null;
//    private int size=0;
//    private int capacity=100;
//    public ArrayList(){
//        data=new String[capacity];
//    }
//    //扩容
//    private void realloc(){
//        capacity=capacity*2;
//        String[] newData=new String[capacity];
//        for(int i=0;i<data.length;i++){
//            newData[i]=data[i];
//        }
//        data=newData;
//    }