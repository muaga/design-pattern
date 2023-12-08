package ch04;

// strategy -> 인코딩

@FunctionalInterface
// 장점 : 추상메소드를 2개 이상 생성하지 못하게 한다. 람다표현식 쓸 때 많이 쓴다.
public interface EncodingStrategy {

    // 추상메소드
    String encode(String text);
}
