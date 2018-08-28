package tallerClase;

import java.util.Scanner;

class pregunta1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado;
		int A,B,C,D;
		
		teclado = new Scanner(System.in);
		System.out.print("introducir primer dato: ");
		A = teclado.nextInt();
		System.out.print("introducir segundo dato: ");
		B = teclado.nextInt();
		System.out.print("introducir tercer dato: ");
		C = teclado.nextInt();
		System.out.print("introducir cuarto dato: ");
		D = teclado.nextInt();
		
	
		
		System.out.println("los numero  son "+D+"," +","+ C +","+B +","+A);

	}

}
