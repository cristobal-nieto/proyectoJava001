package es.ifp.programacion.uf1.practica.ejercicio1;


import java.util.Scanner;

/**
 * ACTIVIDAD EVALUABLE UF1
 * Una empresa de gestión de aguas (dedicada al control de pérdidas) desea implementar una
   calculadora para poder ejecutar en un sistema Linux que no dispone de interfaz gráfica.
   
   Realizar una calculadora de tipo textual que ejecute las operaciones siguientes:
   El usuario podrá introducir un número del 0 al 5.
   El usuario también podrá introducir el operador correspondiente que está en paréntesis.
   Suma : se ejecutará cuando el usuario introduzca un "1" o un "+".
   Resta : se ejecutará cuando el usuario introduzca un "2" o un "-".
   Multiplcación : se ejecutará cuando el usuario introduzca un "3" o un "*".
   División : se ejecutará cuando el usuario introduzca un "4" o un "/".
   Resto : se ejecutará cuando el usuario introduzca un "5" o un "%".
   Salir : se ejecutará cuando el usuario introduzca un "S" o un "s".
   Para realizar esta fase se ha utilizado la estructura básica de control if/else.
   Hemos elegido el bucle do-while ya que se necesitaba que el bloque de instrucciones se ejecutara al menos una vez,
   y si la condición fuera "0","s" o "S" se detuviera.
   
   */

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//DECLARACION DE VARIABLES
	    Scanner sc = new Scanner(System.in);
	    String opcion;
	    float num1;
	    float num2;
		
		do {
		//ENTRADA DE DATOS
	    System.out.println("============ CALCULADORA :: GESTIÓN DE AGUAS, SL ============");
	    System.out.println("1. Sumar (+)");
        System.out.println("2. Restar (-)");
        System.out.println("3. Multiplicar (*)");     
        System.out.println("4. Dividir (/)");
        System.out.println("5. Resto (%)");
        System.out.println("0. Salir (S o s)");
        
        System.out.println("Introduzca una opción:");
        opcion = sc.nextLine();
        
        
        //TRANSFORMACIÓN DE LA INFORMACIÓN
        if  (opcion.equals("1")  || opcion.equals("+")) {
        	 System.out.println("Ha seleccionado la opción de suma");
        	 System.out.println("Introduzca el primer número");	
        	 num1 = Float.parseFloat(sc.nextLine());
        	 System.out.println("Introduzca el segundo número");
        	 num2 = Float.parseFloat(sc.nextLine());
        	 System.out.println("===================================");
        	 System.out.println("La suma de num1 y num2 es:"+(num1+num2));
        	 System.out.println("===================================");
        }	
            else	
        if  (opcion.equals("2")  || opcion.equals("-")) {
        	 System.out.println("Ha seleccionado la opción de resta");
        	 System.out.println("Introduzca el primer número");	
        	 num1 = Float.parseFloat(sc.nextLine());
        	 System.out.println("Introduzca el segundo número");
        	 num2 = Float.parseFloat(sc.nextLine());
        	 System.out.println("===================================");
        	 System.out.println("La resta de num1 y num2 es:"+(num1-num2));
        	 System.out.println("===================================");
        }
        	else
        if  (opcion.equals("3")  || opcion.equals("*")) {
        	 System.out.println("Ha seleccionado la opción de multiplicación");
        	 System.out.println("Introduzca el primer número");	
        	 num1 = Float.parseFloat(sc.nextLine());
        	 System.out.println("Introduzca el segundo número");
        	 num2 = Float.parseFloat(sc.nextLine());
        	 System.out.println("===================================");
        	 System.out.println("La multiplicación de num1 y num2 es:"+(num1*num2));
        	 System.out.println("===================================");
        }
            else
        if  (opcion.equals("4")  || opcion.equals("/")) {
        	 System.out.println("Ha seleccionado la opción de división");
        	 System.out.println("Introduzca el primer número");	
        	 num1 = Float.parseFloat(sc.nextLine());
        	 System.out.println("Introduzca el segundo número");
        	 num2 = Float.parseFloat(sc.nextLine());
        	 System.out.println("===================================");
        	 System.out.println("La división de num1 y num2 es:"+(num1/num2));
        	 System.out.println("===================================");
        }	
        	else
         if (opcion.equals("5")  || opcion.equals("%")) {
        	 System.out.println("Ha seleccionado la opción de resto");
        	 System.out.println("Introduzca el primer número");	
        	 num1 = Float.parseFloat(sc.nextLine());
        	 System.out.println("Introduzca el segundo número");
        	 num2 = Float.parseFloat(sc.nextLine());
        	 System.out.println("===================================");
        	 System.out.println("El resto de num1 y num2 es:"+(num1%num2));
        	 System.out.println("===================================");
        	
         }	
            else
         if (opcion.equals("0")  || opcion.equals("S") ||  opcion.equals("s"))  {
        	 System.out.println("El programa ha finalizado");
         }
            else
        	 System.out.println("Opción incorrecta");	
        	
        
      }  while(!opcion.equals("0") && !opcion.equals("S") && !opcion.equals("s"));
              
		 }
        
        
        
               
      
       
        
       
  

        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}
	
	
	
	


