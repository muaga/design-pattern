package ch01;

// 싱글톤 -> heap 영역에 저장됨
// 싱글톤 메소드 호출하기
public class CoffeeMaker {
    // 2. 자신에 참조 값을 저장할 수 있는 static 변수를 선언
    private static CoffeeMaker instance;

    // 1. 외부에서 생성자를 호출할 수 없도록 코드를 설계
    private CoffeeMaker(){}

    // 3. 객체를 메모리에 올릴 코드를 작성하고
    // 외부에서 접근할 수 있는 메소드를 만들어 준다.
    // 단, 정적 메소드로 만들어 준다.

    public static CoffeeMaker getInstance() {
        if(instance == null) {
            instance = new CoffeeMaker();
        }
        return  instance;
    }

    // 커피 만들기
    public  void makeCoffee(){
        System.out.println("커피가 만들어 졌습니다.");
    }
}
