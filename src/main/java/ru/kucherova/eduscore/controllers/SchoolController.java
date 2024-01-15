package ru.kucherova.eduscore.controllers;

import ru.kucherova.eduscore.services.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class SchoolController {
    private final SchoolService schoolService;

    @GetMapping("/")
    public String schools(@RequestParam(name = "name", required = false) String name, Principal principal, Model model) {
        model.addAttribute("schools", schoolService.listSchools(name));
        model.addAttribute("user", schoolService.getUserByPrincipal(principal));
        return "schools";
    }

    @GetMapping("/school/{id}")
    public String schoolInfo(@PathVariable Long id, Model model){
        model.addAttribute("school", schoolService.getSchoolById(id));
        return "school-info";
    }

}
