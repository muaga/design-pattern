package ch03;

public class HairDryer implements IElectronic110V{

    @Override
    public void connect() {
        System.out.println("헤어 드라이기 연결 110V ON");
    }

    // 110V를 220V로 사용할 수 있도록 어뎁터 구현하기
}
