import ch01.CoffeeMaker;
import ch01.LogWriter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 커피 메이커 인스턴스 얻어서 커피를 만들게 동작 시키기
        System.out.println("- 카페 오픈 -");

        // new가 되지 않는다.
        // CoffeeMaker coffeeMaker = new CoffeeMaker();
        // new를 해서 새로 생성하지 않고 가져오기(클래스.메소드)
        CoffeeMaker coffeeMaker = CoffeeMaker.getInstance();
        coffeeMaker.makeCoffee();

        LogWriter.getInstance().writeLog("커피 결제 완료 : " + LogWriter.dateFormatter(new Date()));

        //
        // 다른 파일에서 또 커피 메이커가 필요할 때
        CoffeeMaker coffeeMaker2 = CoffeeMaker.getInstance();
        coffeeMaker2.makeCoffee();
        LogWriter.getInstance().writeLog("커피 결제 완료 : " + LogWriter.dateFormatter(new Date()));


        // 두 인스턴스가 동일한지 확인 - 주소값 일치 여부
        System.out.println("coffeeMaker == coffeeMaker2 : " +
                (coffeeMaker == coffeeMaker2));
    }


}