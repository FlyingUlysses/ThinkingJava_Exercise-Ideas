package chapter5;

public class Exercise20_22 {

    public static void main(String[] args) {
        //遍历枚举和枚举序号
        for (Twenty enumemation : Twenty.values()) {
            
            System.out.println(enumemation.ordinal()+""+enumemation);
        }
        Twenty fifty = Twenty.FIFTY;
        
        //在switch中使用enumation
        Twenty twenty =  Twenty.FIVE;
        switch (twenty) {
            case ONE:
                System.out.println("一");
                break;
            case FIVE:
                System.out.println("二");
                break;
            default:
                break;
        }
    }
}


//20
enum Twenty{
    ONE, FIVE,TEN,TWENTY,FIFTY,HUNDRED;
    
}