package tallerClase;

import java.util.Scanner;

class pregunta3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado;
		int C,F;
		
		teclado = new Scanner(System.in);
		System.out.print("introducir los grados C° que descas tranformar F°: ");
		C = teclado.nextInt();
		
		
		F= 32+(9*C/5);
		
		
		System.out.println("los grados en F° son: "+F+"°");
		
		

	}

}
