package global;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropTest {
	public static void main(String[] args) {
        try {
            String propFile = "test.properties";
            // 프로퍼티 객체 생성
            Properties props = new Properties();
            // 프로퍼티 파일 스트림에 담기
            FileInputStream fis = new FileInputStream(propFile);
            // 프로퍼티 파일 로딩
            props.load(new java.io.BufferedInputStream(fis));
            // 항목 읽기
            String msg = props.getProperty("A") ;
            // 콘솔 출력
            System.out.println(msg) ;
        } catch (Exception e) {
            e.printStackTrace();
        } 
	}
}
