package ua.com.cib.exim.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.com.cib.exim.SimpleDBAccess;

@Controller
public class MyController {
    final SimpleDBAccess access;

    @Autowired
    public MyController(SimpleDBAccess access) {
        this.access = access;
    }

    @RequestMapping (value = "/hello1")
    public String hello(ModelMap map){
        map.addAttribute("db", access.getVersion());
        return "index";
    }
}
