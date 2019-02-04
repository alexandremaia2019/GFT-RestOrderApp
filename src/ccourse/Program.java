package ccourse;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Definições dos Arays de Opções e Quantidades
		String[] dishTypeMorning = new String[4];		
		dishTypeMorning[0] = "Eggs";
		dishTypeMorning[1] = "Toast";
		dishTypeMorning[2] = "Coffee";
		dishTypeMorning[3] = "Error";
		
		Integer[] dishQtdeMorning = new Integer[4];		
		dishQtdeMorning[0] = 0;
		dishQtdeMorning[1] = 0;
		dishQtdeMorning[2] = 0;	
		dishQtdeMorning[3] = 0;
	
		String[] dishTypeNight = new String[5];		
		dishTypeNight[0] = "Steak";
		dishTypeNight[1] = "Potato";
		dishTypeNight[2] = "Wine";
		dishTypeNight[3] = "Cake";	
		dishTypeNight[4] = "Error";	
			
		Integer[] dishQtdeNight = new Integer[5];		
		dishQtdeNight[0] = 0;
		dishQtdeNight[1] = 0;
		dishQtdeNight[2] = 0;
		dishQtdeNight[3] = 0;
		dishQtdeNight[4] = 0;
		
		System.out.println("Enter Your Order:"); 
		
		// Leitura da área de Input
		String dishType = sc.nextLine();
		
		// Definições de variáves de trabalho 
		char cm;   cm  = 'm';
		char cmu;  cmu = 'M';
		char cf;   cf  = 'S';
		String cp; cp  = "Potato";
		String cc; cc  = "Coffee";
				
		char c1; c1 = '1';
		char c2; c2 = '2';
		char c3; c3 = '3';
		char c4; c4 = '4';
		char c5; c5 = '5';
		
		// Identificação do Dish Type (Morning)
		if (dishType.charAt(0) == cm || dishType.charAt(0) == cmu) {
					
		// Acumulo das quantidades das opçoes solicitadas
			for (int i=9; i<dishType.length(); i++) {
							
			if (dishType.charAt(i) == c1) {
				dishQtdeMorning[0]++;
			} 
			else if (dishType.charAt(i) == c2) {
				dishQtdeMorning[1]++;
		  	} 
			else if (dishType.charAt(i) == c3) {
				dishQtdeMorning[2]++;
			} 
			else if (dishType.charAt(i) == c4) { 
				dishQtdeMorning[3]++;
			};	
		};
		
		System.out.println("Output:"); 
		
		String outPut;
		outPut = "";
		
		// Preparação da área de Output
		for (int y=0; y < dishQtdeMorning.length; y++) {
			if (dishQtdeMorning[y] > 0) {
				outPut += dishTypeMorning[y];
				
				if (dishQtdeMorning[y] > 1) {
					if (dishTypeMorning[y] == cc) {
						outPut += "(x" ;
						outPut += dishQtdeMorning[y];
						outPut += ")";	
					} else {
					outPut += ", Error";
					cf  = 'N';
					break;
					}
				}
		    	outPut += ", ";
			};
		};
		
		// Print da área de Output
		int z; 	z = outPut.length(); 	
		if (cf  == 'S') {
			z--; 	z--;
		}
				
		String outPutFinal;
		outPutFinal = outPut.substring(0, z);		
		System.out.println(outPutFinal);
		
		} else {
			// Identificação do Dish Type (Night)	
			for (int i=7; i<dishType.length(); i++) {
			
			// Acumulo das quantidaddes de opções solicitadas
				if (dishType.charAt(i) == c1) {
					dishQtdeNight[0]++;
				} 
				else if (dishType.charAt(i) == c2) {
					dishQtdeNight[1]++;
			  	} 
				else if (dishType.charAt(i) == c3) {
					dishQtdeNight[2]++;
				} 
				else if (dishType.charAt(i) == c4) { 
					dishQtdeNight[3]++;
				}
				else if (dishType.charAt(i) == c5) { 
					dishQtdeNight[4]++;
				};	
			};
			
			System.out.println("Output:"); 
			
			String outPut;
			outPut = "";
			
			// preparação da área de Output
			for (int y=0; y < dishQtdeNight.length; y++) {
				if (dishQtdeNight[y] > 0) {
					outPut += dishTypeNight[y];
					
					if (dishQtdeNight[y] > 1 ) {
				
						if (dishTypeNight[y] == cp) {
						outPut += "(x" ;
						outPut += dishQtdeNight[y];
						outPut += ")";
						} else {
							outPut += ", Error";
							cf  = 'N';
							break;
						}
					}
			    	outPut += ", ";
				};
			};
			
			// Print da área de Output
			int z; 	z = outPut.length(); 
			
			if (cf  == 'S') {
				z--; 	z--;
			}
					
			String outPutFinal;
			outPutFinal = outPut.substring(0, z);		
			System.out.println(outPutFinal);
			
		}
		
		sc.close();		
	}
}
			

		
			


			
