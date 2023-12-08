package ch04;

import java.util.Base64;

// 구현 클래스 만들기
// 역할 : 인코딩
public class Base64Strategy implements EncodingStrategy {

    @Override
    public String encode(String text) {

        return Base64.getEncoder().encodeToString(text.getBytes());
        // ()안에는 바이트타입이 들어가야 한다.
    }
}
