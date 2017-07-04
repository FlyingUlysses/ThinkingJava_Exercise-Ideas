package chapter5;

public class Exercise16 {
    public static void main(String[] args) {
        //16,遍历打印String数组
      /*  String[] ss ={"1","2"};
        for (String s : ss) {
            System.out.println(s);
        }*/
        
        //17.创建一个类，构造函数输出语句，创造该类数组，不给数组赋值，看是否创建了该类对象-------否
      //  Seventeen[] temp = new Seventeen[3];
        
        //18.给17赋值
      //  temp[1] =new Seventeen("eighteen");
        
        //19.创建可变参数列表
        Nighteen.test("1","11","111");
        String[] sss={"2","22"};
        Nighteen.test(sss );

        //20.太简单
    }
}

//17,18
    class Seventeen {
        Seventeen(String s){
            System.out.println(s);
        }
    }
    
//19
    class Nighteen{
        public static void test(String...ss){
            for (String s : ss) {
                System.out.println(s);
            }
        }
    }