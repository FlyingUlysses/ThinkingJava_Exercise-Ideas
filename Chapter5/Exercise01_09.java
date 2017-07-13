package chapter5;

public class Exercise01_09 {
    public static void main(String[] args) {
        //1
       System.out.println(new one().s);
       //2
       System.out.println(new two().s2);
       System.out.println(new two("2").s2);
       //345678太简单
       //9
       new night();
    }
}


//1，创建一个包含未赋值的String的类
class one{
    String s;
}
//2.定义初始和构造初始的string，有什么区别?
class two{
    String s ="1";
    String s2;
    two(){
        
    }
    two(String s){
        this.s2=s;
    }
}
//3一个无参打印数据的类
class three{
    three(){
        System.out.println("无参three");
    }
}
//4.一个无参，和有参
class four{
    four(){
        System.out.println("无参four");
    }
    four(String s){
        System.out.println("有参four："+s);
    }
}

class father{
    private String s;
}


class endless extends father{
    public Object getEndless(){
        return this;
    }
}

//9
class night{
    night(){
        this("ss");
    }
    night(String s ){
        System.err.println(s);
    }
}
