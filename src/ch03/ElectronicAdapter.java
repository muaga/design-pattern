package ch03;

// 어뎁터 패턴 구현하기
// 집에는 220V이다. 그래서 220V 구체화하기
public class ElectronicAdapter implements IElectronic220V{

    // 1. 변환하고자 하는 스펙을 호환관계로 만들어 준다.
    // 변환할 객체(추상화 된 부분)를 선언한다.
    private IElectronic110V electronic110V;

    // 2. 생성자를 통해서 의존 주입 받을 수 있도록 설계한다.
    // 변환하고자 하는 객체를 매개변수로 받는다.
    public ElectronicAdapter(IElectronic110V electronic110V){
        this.electronic110V = electronic110V;
    }

    @Override
    public void connect() {
        // 220V에 connect() 메소드를 호출하지만,
        // 실제로 연결은 110V connect() 메소드이다
        electronic110V.connect();
    }
}
