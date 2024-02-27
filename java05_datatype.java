package chapter02;

public class java05_datatype {
    public static void main(String[] args) {
        //TODO 数据类型转换
        String name= "shabi";
        int age = 30;
        //字母和数字转换不了
        //
        //小的可以给大的 从大到小不可以
        byte n = 10;
        int s = n;
        //int u =1;
        //byte s =u;不可以
        //强制转换需要（）
        double d = 1.2;
        int aw = (int)d;
        System.out.println(aw);
    }

}
