import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList {
//    实现顺序表代码
    public static void main(String[] args){
        ArrayList<String> arrayList=new ArrayList();
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        //尾插
        arrayList.add("c");
        arrayList.add("c++");
        arrayList.add("java");
        arrayList.add("python");

        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList);
        //添加到指定位置
        arrayList.add(2,"javascript");
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList);
        //删除元素
        arrayList.remove(2);
        System.out.println("按位置删除:"+arrayList);
//        arrayList.remove("javascript");
//        System.out.println("按元素删除:"+arrayList);
        //查找
        String e=arrayList.get(0);
        System.out.println("0号元素为："+e);
        arrayList.set(0,"c#");
        System.out.println("修改之后的顺序表为："+arrayList);
        boolean ret= arrayList.contains("c");
        System.out.println("查找c的结果是："+ret);
        int index= arrayList.indexOf("java");
        System.out.println("查找java的结果是："+index);

        //下标遍历
        System.out.println("通过下标遍历元素");
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        //迭代器遍历
        System.out.println("通过迭代器遍历元素");
        Iterator<String> iterable=arrayList.iterator();
        while (iterable.hasNext()){
            String elem= iterable.next();
            System.out.println(elem);
        }
        System.out.println("通过for each遍历元素");
        for(String el:arrayList){
            System.out.println(el);
        }
    }
}
