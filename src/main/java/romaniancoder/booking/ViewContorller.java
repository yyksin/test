package romaniancoder.booking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by IMC021 on 2017. 7. 26..
 */
@Controller
public class ViewContorller {
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("datetime",new Date());
        model.addAttribute("username","yyk1111");
        model.addAttribute("mode","production");
        return "index";
    }
}
