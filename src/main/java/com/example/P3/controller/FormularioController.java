package com.example.P3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.P3.model.Usuario;

@Controller

public class FormularioController {

    //Muestra el formulario GET- 
    //sirve para manejar solicitudes HTTP GET especialmente (se usan para definir endpoints que obtienen datos)
    @GetMapping("/formulario")
    
    public String mostrarformulario(Model model){
    model.addAttribute("usuario", new Usuario());
    return "form"; //form.htlm
    }
//Procesa los datos enviados POSTMapping
    @PostMapping("/procesar")
    public String procesarFormulario(Usuario usuario, Model model){
        model.addAttribute("usuario", usuario);
        return "resultado";//resultado.html
        
    }

   @GetMapping("/")
public String inicio() {
    return "index";
}
    
    
}
