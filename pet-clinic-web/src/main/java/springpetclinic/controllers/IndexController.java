package springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author j.h on 7/20/20
 */
@Controller
public class IndexController {

    /*
     * what it means is when there's a request that comes in to the root context
     * or root slash index or index.html,
     * they're all going to match to this RequestMapping
     */
    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {

        return "index";
    }
}
