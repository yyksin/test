package romaniancoder.booking;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//주석 추가
@SpringBootApplication
@EnableJSONDoc
public class BookingdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingdemoApplication.class, args);
	}
}
