package com.fsb.greeting.web.controllers;


import com.fsb.greeting.business.services.VilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/villes")
public class VilleController {

    @Autowired
    private VilleService villeService;

    @GetMapping
    public String listVilles(Model model) {
        model.addAttribute("villes", villeService.getAllVilles());
        return "villes";
    }

    @GetMapping("/delete/{id}")
    public String deleteVille(@PathVariable Long id) {
        villeService.deleteVille(id);
        return "redirect:/villes";
    }
}
