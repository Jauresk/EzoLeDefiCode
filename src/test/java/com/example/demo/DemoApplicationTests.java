package com.example.demo;

import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	private static DemoApplication.Calculatrice calculatrice;

	private static double a;
	private static double b;

	private static OperationTest addition;
	private static OperationTest soustraire;
	private static OperationTest produit;
	private static OperationTest division;

	@BeforeEach
	void init() {
		calculatrice = new DemoApplication.Calculatrice();
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

		a = 2.8;
		b = 3;
		double pdt = calculatrice.calculer(a, b, produit);
		System.out.println(pdt);

		b = 1;
		double sub = calculatrice.calculer(pdt, b, soustraire);

		System.out.println(sub);

		assertTrue(sub == 7.4);
	}

	/*
	*


"2^8"	"256"
"2^8*5-1"	"1279"
"sqrt(4)"	"2"
"1/0"	Erreur*
	* */
}
