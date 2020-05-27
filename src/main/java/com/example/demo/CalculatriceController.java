package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatriceController {

    private Calculatrice calculatrice;

    @Autowired
    public void setCalculatrice(Calculatrice calculatrice) {
        this.calculatrice = calculatrice;
    }

    @RequestMapping("/")
    public String redirToList(){
        return "redirect:/form";
    }

    @GetMapping("/form")
    public String helloForm(){
        return "form";
    }

    @RequestMapping(value = "/form/add/{a}/{b}", method = RequestMethod.GET)
    public String additioner(@PathVariable double a, @PathVariable double b, Model model) {
        double result = calculatrice.additioner(a, b);
        model.addAttribute("result",result);
        return "form";
    }

    @RequestMapping(value = "/form/sub/{a}/{b}", method = RequestMethod.GET)
    public String soustraire(@PathVariable double a, @PathVariable double b, Model model) {
        double result = calculatrice.soustraire(a, b);
        model.addAttribute("result",result);
        return "form";
    }

    @RequestMapping(value ="/form/pdt/{a}/{b}", method = RequestMethod.GET)
    public String produit(@PathVariable double a, @PathVariable double b, Model model) {
        double result = calculatrice.produit(a, b);
        model.addAttribute("result",result);
        return "form";
    }

    @RequestMapping(value = "/form/div/{a}/{b}", method = RequestMethod.GET)
    public String division(@PathVariable double a, @PathVariable double b, Model model) {
        double result = calculatrice.division(a, b);
        model.addAttribute("result",result);
        return "form";
    }

}
