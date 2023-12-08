package ch04;

// OCP : 확장에는 열려있고 변경에는 닫혀있다.
// Encoder 클래스는 변경하지 않더라도 다양한 인코딩 방식을
// EncodingStrategy 인터페이스를 통해 사용할 수 있도록 한다.

// Encoder - EncodingStrategy(인터페이스) - AppendStrategy/Base64Strategy
public class MainTest {
    public static void main(String[] args) {
        Base64Strategy base64Strategy = new Base64Strategy();
        AppendStrategy appendStrategy = new AppendStrategy();

        Encoder encoder = new Encoder(base64Strategy);

        String message = "안녕";
        System.out.println(encoder.getMessage(message));

        // 메소드 의존 주입
        encoder.setEncodingStrategy(appendStrategy);
        System.out.println(encoder.getMessage(message));
    }
}
