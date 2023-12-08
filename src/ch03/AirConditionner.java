package ch03;


public class AirConditionner implements IElectronic220V{

    // 220V에 연결하면 반드시 connect를 해야 한다.
    @Override
    public void connect() {
        System.out.println("에어컨 연결 220V ON");
    }

    // 220V를 110V로 사용할 수 있도록 어뎁터 구현하기

}
