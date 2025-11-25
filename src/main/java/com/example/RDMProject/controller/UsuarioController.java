package com.example.RDMProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@Controller
public class UsuarioController {
    @GetMapping("/prueba")
    public String detalle(Model model){
        model.addAttribute("title","Recuerdo madre");
        return "detalles.html";
    }
}
