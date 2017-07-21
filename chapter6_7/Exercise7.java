package chapter6_7;

public class Exercise7 {
    public static void main(String[] args) {
        //1.创建一个惰性初始的组合类
        System.out.println(new One().getCreateSub());
        //没什么难点
        
        Super s = new Sub();
       
        Super s2 = new Super();
        
    }
}

class One{
    private OneToSub s;
    
    public String getCreateSub(){
        if (s==null) {
            s=new OneToSub();
        }
        return s.toString();
    }
    
    class OneToSub{
    }
}

class Super{
    public Super ss =new Super();
    public void index (){
        ss.say();
    }
    private String say(){
        return "hi";
    }
}
class Sub extends Super{
    
}