package tallerClase;

import java.util.Scanner;

class pregunta7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner teclado=new Scanner(System.in);
        
        int Numero;
        
        System.out.print("ingresa el numero a Multiplicar :");
        Numero = teclado.nextInt();
        
        
        for(int i = 1, j = i ; i <= 12; i++, j = i * Numero) {
        	
        	
    	    System.out.println(""+Numero+" X " + i + " = " + j);

        }
        
	}

}
