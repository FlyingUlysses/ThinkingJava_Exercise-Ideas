package chapter6_7;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        //1-7 无意义略过
        //8 创建一个还有数组的bean
        eight eight = new eight();
        eight.setConnection("haha");
        System.out.println(Arrays.toString(eight.getConnection()));
        
    }
}

 class eight{
     private String[] connection = new String[10];
     
     public String[] getConnection(){
         return connection;
     }
     
     public void setConnection(String s){
         int tempNum = new Random().nextInt(10);
         connection[tempNum] =s;
     }
}