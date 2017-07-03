package chapter5;

public class Exercise10_12 {
    public static void main(String[] args) throws Exception {
        //10,11 编写一个带有finalize类，并使finalize百分百调用
        new Ten(false);
            System.gc();
           Thread.sleep(1000);
        
        
        //12 编写一个tank类，对应现实，对象被回收时必须处于空状态，如果不是，在finalize中报异常
        new Tank().install();
        System.gc();
        Thread.sleep(1000);
        
        
    }
}

//10
class Ten{
    Ten(Boolean b){
        flag =b;
    };
   static Boolean flag=false;
    @Override
    protected void finalize()throws Throwable {
        super.finalize();
        if (flag) {
            System.out.println("ten:true");
        }
        if (flag == false) {
            System.out.println("ten:false");
        }
    }
    
    public void change(){
        flag =true;
    }
}
//11 太简单，和上类似

//12 
class Tank{
    String state ="empty";
    
    public void install(){
        state ="full";
    }
    
    public void outlet(){
        state = "empty";
    }
    
    @Override
    protected void finalize()
        throws Throwable {
        super.finalize();
        if (state=="full" ) {
            System.out.println("eleven error: 挪用公物");
        }
    }
}