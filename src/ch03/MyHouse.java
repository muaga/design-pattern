package ch03;

// 어뎁터
public class MyHouse {

    // 집은 220V이므로 220V를 매개변수로 받는다. -> 고정된 스펙(정적)
    public static void homeconnect(IElectronic220V electronic220V){
        electronic220V.connect();
    }

    public static void main(String[] args){
        // 집의 사용 전압 220V
        // 일본 가전 제품은 110V
        // 두 개의 스펙은 동일하다고 가정하자 (void connect)

        AirConditionner airConditionner = new AirConditionner();
        HairDryer dryer = new HairDryer();
        Cleaner cleaner = new Cleaner();

        // 사용해보기
        homeconnect(airConditionner); // 에어컨 바로 연결 가능
        // homeconnect(dryer); // 드라이기 집에 바로 연결 불가능

        // 어뎁터 가져오기
        ElectronicAdapter dryerAdapter = new ElectronicAdapter(dryer);
        homeconnect(dryerAdapter);

        ElectronicAdapter cleanerAdapter = new ElectronicAdapter(cleaner);
        homeconnect(cleanerAdapter);

    }

}
