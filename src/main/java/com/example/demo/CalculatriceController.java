package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class CalculatriceController {

    private Calculatrice calculatrice;

    @Autowired
    public void setCalculatrice(Calculatrice calculatrice) {
        this.calculatrice = calculatrice;
    }

    @RequestMapping("add/{a}/{b}")
    public double additioner(@PathVariable double a, @PathVariable double b) {
        return calculatrice.additioner(a, b);
    }

    @RequestMapping("sub/{a}/{b}")
    public double soustraire(@PathVariable double a, @PathVariable double b) {
        return calculatrice.soustraire(a, b);
    }

    @RequestMapping("pdt/{a}/{b}")
    public double produit(@PathVariable double a, @PathVariable double b) {
        return calculatrice.produit(a, b);
    }

    @RequestMapping("div/{a}/{b}")
    public double division(@PathVariable double a, @PathVariable double b) {
        return calculatrice.division(a, b);
    }

}
