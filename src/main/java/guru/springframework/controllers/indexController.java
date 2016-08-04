package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by awharshana on 8/4/2016.
 */
@Controller
public class indexController {

    @RequestMapping("/")
    public String getIndex(){
        return "index";
    }
}
