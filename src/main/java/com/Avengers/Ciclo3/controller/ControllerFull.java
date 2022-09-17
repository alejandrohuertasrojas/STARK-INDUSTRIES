package com.Avengers.Ciclo3.controller;

import com.Avengers.Ciclo3.modelos.Empresa;
import com.Avengers.Ciclo3.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ControllerFull {
    @Autowired
    EmpresaService empresaService;

    @GetMapping ({"/Empresas","/VerEmpresas"})
    public String viewEmpresas(Model model){
        List<Empresa> listEmpresas=empresaService.getAllEmpresas();
        model.addAttribute("emplist", listEmpresas);
        return "verEmpresas";
    }


}
