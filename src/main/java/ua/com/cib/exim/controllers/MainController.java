package ua.com.cib.exim.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.com.cib.exim.dao.User;
import ua.com.cib.exim.db.DBAccess;

import java.util.List;

@Controller
public class MainController {
    private final DBAccess dbAccess;

    @Autowired
    public MainController(DBAccess dbAccess) {
        this.dbAccess = dbAccess;
    }

    @RequestMapping(value = "/getdbversion")
    public String hello(ModelMap map){
        map.addAttribute("db", dbAccess.getVersion());
        return "index";
    }

    @RequestMapping (value = "/getusers")
    public void getAllUsers(ModelMap map){
        map.addAttribute("dbusers", dbAccess.getUsers());
//        return "index";
    }
}
