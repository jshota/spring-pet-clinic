package springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author j.h on 7/20/20
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "/index", "/index.html"}) // Watch out: needs an empty string here
    public String listOwners() {

        return "owners/index";
    }
}
