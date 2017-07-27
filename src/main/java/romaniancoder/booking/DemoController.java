package romaniancoder.booking;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IMC021 on 2017. 7. 26..
 */
@RestController
public class DemoController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
