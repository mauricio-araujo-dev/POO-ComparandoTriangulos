package controller;

import java.util.Scanner;

import Triangulo.Triangulo;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x , y;
		x= new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite as medidas do Triângulo X:");
		x.ladoA = sc.nextDouble();
		x.ladoB = sc.nextDouble();
		x.ladoC = sc.nextDouble();
		System.out.println("Digite as medidas do Triângulo Y:");
		y.ladoA = sc.nextDouble();
		y.ladoB = sc.nextDouble();
		y.ladoC = sc.nextDouble();
		
		double p = (x.ladoA + x.ladoB + x.ladoC) / 2 ;
		double areaX = Math.sqrt(p * (p - x.ladoA) * (p - x.ladoB) * (p - x.ladoC));
		
		p = (y.ladoA + y.ladoB + y.ladoC) / 2 ;
		double areaY = Math.sqrt(p * (p - y.ladoA) * (p - y.ladoB) * (p - y.ladoC));
		
		System.out.println("Área do triãngulo X:"+ areaX);
		System.out.println("Área do triãngulo Y:"+ areaY);
		
		if ( areaX > areaY) {
			System.out.println("O maior triângulo é o X");
		}else {
			System.out.println("O maior triângulo é o Y");
		}
		
		sc.close();
	}

}
