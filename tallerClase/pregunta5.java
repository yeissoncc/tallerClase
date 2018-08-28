package tallerClase;

import java.util.Scanner;

class pregunta5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado;
		float Velocidad,Resultado;
		
		teclado = new Scanner(System.in);
		System.out.print("ingrese velocidad Km/H para cambiar a M/s: ");
		Velocidad = teclado.nextInt();
		
		
		Resultado = (Velocidad*5/18);
		
		System.out.println("las horas cambiadas son: "+Resultado+"M/s");

	}

}
