package ua.com.cib.exim.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DispatcherController {
    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String indexPage(){
        return "index";
    }

    @RequestMapping (value = "/exim/create", method= RequestMethod.POST)
    public String createMail(){



        return "index";
    }

    @ResponseBody ()
    public String dow() {
        return "sadads";
    }

}
