package ch01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

// 싱글톤
// 어떤 데이터가 생성되면 출력하기
public class LogWriter {

    // 2. 자신에 참조값을 담을 정적 변수 선언
    private static LogWriter instance;
    private static BufferedWriter writer;

    // 1. 외부에서 접근 불가 생성자 생성
    private LogWriter (){
        try {
            writer = new BufferedWriter(new FileWriter("log.txt", true));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    // 멀티스레드
    // 공유 개념 <-- t1, t2가 사용하려면 잘못된 결과를 낳을 수 있다.
    // 예를 들어 공동 계좌가 있다면 a, b가 같이 쓴다면 동시에 작업이 일어나서 의도치 않은 결과가
    // 일어날 수 있다.

    // 동기화
    // 공유 개념을 공유해서 사용할 때, lock을 걸어서 동시 작업이 일어나지 않도록 막는 것

    // 3. 외부에서 접근 가능한 정적 메소드 만들어 주기
    public static LogWriter getInstance(){
        if(instance == null){
            instance = new LogWriter();
        }
        return instance;
    }

    // 로그 작성 기능
    public void writeLog(String log){
        try {
            writer.write(log);
            writer.newLine(); // bufferedWriter는 마지막에 끝마침을 표시해줘야 한다.
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String dateFormatter(Date date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        return dateFormat.format(date);
    }
}


