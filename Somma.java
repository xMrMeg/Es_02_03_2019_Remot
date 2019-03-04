import java.io.*;
import java.util.Scanner;

public class Somma {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Inserire a = ");
		int a = s.nextInt();
		System.out.println("Inserire b = ");
		int b = s.nextInt();
		
		int somma = a+b;
		
		System.out.println("La somma e' " + somma);
	}
	

}