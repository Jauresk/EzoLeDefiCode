package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class Calculatrice {

    public Calculatrice () {}

    public double calculer(double a, double b, OperationTest op){ return op.operation(a,b); }

    OperationTest addition = (double a, double b) -> a + b;
    OperationTest soustraire = (double a, double b) -> a - b;
    OperationTest produit = (a, b) -> a * b;
    OperationTest division = (a, b) -> a / b;


    double additioner(double a, double b) {
       return calculer(a, b, addition);
    };

    double soustraire(double a, double b) {
        return calculer(a, b, soustraire);
    };

    double produit(double a, double b) {
        return calculer(a, b, produit);
    };

    double division(double a, double b) {
        return calculer(a, b, division);
    };
}
