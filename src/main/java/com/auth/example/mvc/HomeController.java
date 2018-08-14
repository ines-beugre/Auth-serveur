package com.auth.example.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;
import java.util.Map;

@SuppressWarnings("unused")
@Controller
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/portal/home", method = RequestMethod.GET)
    protected String home(final Map<String, Object> model, final Principal principal) {
        logger.info("Home page");
        if (principal == null) {
            System.out.println("connection en cours");
            return "redirect:/logout";
        }
        model.put("userId", principal);
        System.out.println("connecté!!!!");
        return "home";
    }



}