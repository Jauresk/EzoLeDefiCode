package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static class Calculatrice {
		public Calculatrice () {}

		public double calculer(double a, double b, OperationTest op){ return op.operation(a,b); }
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Calculatrice calcul = new Calculatrice();
		OperationTest addition = (double a, double b) -> a + b;
		OperationTest soustraire = (double a, double b) -> a - b;
		OperationTest produit = (a, b) -> a * b;
		OperationTest division = (a, b) -> a / b;

		int a = 1;
		int b = 1;
		double add = calcul.calculer(a, b, addition);
		double sub = calcul.calculer(a, b, soustraire);
		double pdt = calcul.calculer(a, b, produit);
		double div = calcul.calculer(a, b, division);

		System.out.println("addition+++++"+add);
		System.out.println("soustraire----"+sub);
		System.out.println("produit*****"+pdt);
		System.out.println("division/////"+div);



	}

}
