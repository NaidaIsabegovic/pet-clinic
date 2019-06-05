package com.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {

    @RequestMapping({"/vets", "/vets/index", "vets/index.html"})
    public String listVets() {

        return "vets/index";
    }

    public String listVets(Model model) {
        return "vets/index";
    }
}
