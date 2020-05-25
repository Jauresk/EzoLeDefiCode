package com.example.demo;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	private static Calculatrice calculatrice;

	private static double a;
	private static double b;

	private static OperationTest addition;
	private static OperationTest soustraire;
	private static OperationTest produit;
	private static OperationTest division;

	@BeforeEach
	void init() {
		calculatrice = new Calculatrice();
		a = 1;
		b = 1;
		addition = (double a, double b) -> a + b;
		soustraire = (double a, double b) -> a - b;
		produit = (a, b) -> a * b;
		division = (a, b) -> a / b;
	}
/*
Test	Résultat attendu

*/

    // "1+1"	"1"
	@Test
	public void assertThatAdditionNotReturnFalseValue() {
		double add = calculatrice.calculer(a, b, addition);
		assertNotEquals(add, 1);
	}

	// "1 + 2"	"3"
	@Test
	public void assertThatAdditionReturnTrueValue1() {
		b = 2;
		double add = calculatrice.calculer(a, b, addition);
		System.out.println(add);
		assertTrue(add == 3.0);
	}

	// "1 + -1"	"0"
	@Test
	public void assertThatAdditionReturnTrueValue2() {
		b = -1;
		double add = calculatrice.calculer(a, b, addition);
		System.out.println(add);
		assertTrue(add == 0.0);
	}

	// "-1 - -1"	"0"
	@Test
	public void assertThatSoustractionReturnTrueValue3() {
		a = -1;
		b = -1;
		double sub = calculatrice.calculer(a, b, soustraire);
		System.out.println(sub);
		assertTrue(sub == 0.0);
	}

	// "5-4"	"1"
	@Test
	public void assertThatSoustractionReturnTrueValue4() {
		a = 5;
		b = 4;
		double sub = calculatrice.calculer(a, b, soustraire);
		System.out.println(sub);
		assertTrue(sub == 1.0);
	}

	// "5*2"	"10"
	@Test
	public void assertThatProduitReturnTrueValue5() {
		a = 5;
		b = 2;
		double pdt = calculatrice.calculer(a, b, produit);
		System.out.println(pdt);
		assertTrue(pdt == 10.0);
	}

	//"(2+5)*3"	"21"
	@Test
	public void assertThatAdditionAndProduitReturnTrueValue6() {
		a = 2;
		b = 5;
		int c = 3;
		double add = calculatrice.calculer(a, b, addition);
		double pdt = calculatrice.calculer(add, c, produit);
		System.out.println(pdt);
		assertTrue(pdt == 21.0);
	}

	// "10/2"	"5"
	@Test
	public void assertThatDivisionReturnTrueValue7() {
		a = 10;
		b = 2;

		double div = calculatrice.calculer(a, b, division);
		System.out.println(div);
		assertTrue(div == 5.0);
	}

	// "2+2*5+5"	"17"
	@Test
	public void assertThatAdditionAndMultiplicationReturnTrueValue8() {

		a = 2;
		b = 5;
		double pdt = calculatrice.calculer(a, b, produit);
		System.out.println(pdt);

		a = 2;
		b = 5;
		double add1 = calculatrice.calculer(a, b, addition);
		double add2 = calculatrice.calculer(add1, pdt, addition);
		System.out.println(add2);

		assertTrue(add2 == 17.0);
	}

	// "2.8*3-1"	"7.4"
	@Test
	public void assertThatSoustraireAndMultiplicationReturnTrueValue9() {

		a= 2.8;
		b = 3;
		double pdt = calculatrice.calculer(a, b, produit);
		System.out.println(pdt);

		b = 1;
		double sub = calculatrice.calculer(pdt, b, soustraire);

		System.out.println(sub);

		assertTrue(sub == 7.399999999999999);
	}


	// "2^8"	"256"
	@Test
	public void assertThatMultiplicationPuissanceReturnTrueValue10() {

		a = 2;
		b = 2;
		double pdt = calculatrice.calculer(a, b, produit);
		System.out.println(pdt);
		double pdt1 = calculatrice.calculer(pdt, b, produit);
		System.out.println(pdt1);
		double pdt2 = calculatrice.calculer(pdt1, b, produit);
		System.out.println(pdt2);
		double pdt3 = calculatrice.calculer(pdt2, b, produit);
		System.out.println(pdt3);
		double pdt4 = calculatrice.calculer(pdt3, b, produit);
		System.out.println(pdt4);
		double pdt5 = calculatrice.calculer(pdt4, b, produit);
		System.out.println(pdt5);
		double pdt6 = calculatrice.calculer(pdt5, b, produit);
		System.out.println(pdt6);

		assertTrue(pdt6 == 256.0);
	}


	// "2^8*5-1"	"1279"
	@Test
	public void assertThatMultiplicationPuissanceSoustractionReturnTrueValue11() {

		a = 2;
		b = 2;
		double pdt = calculatrice.calculer(a, b, produit);
		System.out.println(pdt);
		double pdt1 = calculatrice.calculer(pdt, b, produit);
		System.out.println(pdt1);
		double pdt2 = calculatrice.calculer(pdt1, b, produit);
		System.out.println(pdt2);
		double pdt3 = calculatrice.calculer(pdt2, b, produit);
		System.out.println(pdt3);
		double pdt4 = calculatrice.calculer(pdt3, b, produit);
		System.out.println(pdt4);
		double pdt5 = calculatrice.calculer(pdt4, b, produit);
		System.out.println(pdt5);
		double pdt6 = calculatrice.calculer(pdt5, b, produit);
		System.out.println(pdt6);

		assertTrue(pdt6 == 256.0);

		double pdt7 = calculatrice.calculer(pdt6, 5, produit);
		System.out.println(pdt7);

		double pdt8 = calculatrice.calculer(pdt7, 1, soustraire);
		System.out.println(pdt7);
		assertTrue(pdt8 == 1279.0);
	}


	// "sqrt(4)"	"2"
	@Test
	public void assertThatMultiplicationPuissanceReturnTrueValue12() {

		a = 2;
		double puiss = calculatrice.calculer(a, a, produit);
		System.out.println(puiss);

		assertTrue(puiss == 4.0);
		assertTrue(a == 2.0);
	}

	// "1/0"	Erreur*
	@Test
	public void assertThatErrorReturnTrueValue13() {

		a = 1;
		b = 0;

		assertEquals("divide double by zero should be infinity", true, Double
				.isInfinite(calculatrice.calculer(a, b, division)));

	}

}
