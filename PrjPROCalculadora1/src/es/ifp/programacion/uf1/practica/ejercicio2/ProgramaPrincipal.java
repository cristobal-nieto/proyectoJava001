package es.ifp.programacion.uf1.practica.ejercicio2;


import java.util.Scanner;


/**
 * ACTIVIDAD EVALUABLE UF1
 * Una empresa de gestión de aguas (dedicada al control de pérdidas) desea implementar una mejora en su
   calculadora para poder ejecutar en un sistema Linux que no dispone de interfaz gráfica.
   
   Realizar una calculadora de tipo textual que ejecute las operaciones siguientes:
   El usuario podrá introducir un número del 0 al 5.
   El usuario también podrá introducir el operador correspondiente que está en paréntesis.
   Las operaciones serán realizadas por funciones.
   El menú de selección de opciones será realizado por un procedimiento.
   Suma : se ejecutará cuando el usuario introduzca un "1" o un "+".
   Resta : se ejecutará cuando el usuario introduzca un "2" o un "-".
   Multiplcación : se ejecutará cuando el usuario introduzca un "3" o un "*".
   División : se ejecutará cuando el usuario introduzca un "4" o un "/".
   Factorial : se ejecutará cuando el usuario introduzca un "5" o un "!".
   Salir : se ejecutará cuando el usuario introduzca un "S" o un "s".
   Para realizar esta fase se ha utilizado la estructura básica de control if/else.
   Hemos elegido el bucle do-while ya que se necesitaba que el bloque de instrucciones se ejecutara al menos una vez,
   y si la condición fuera "0","s" o "S" se detuviera.
   
   
   
   */

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//DECLARACION DE VARIABLES
	    String opcion;
	    Scanner sc = new Scanner(System.in);
	    float num1 ;
	    float num2 ;
	    float resultado ;
	    
	    do {
	    //ENTRADA DE DATOS Y LLAMADAS A FUNCIONES Y PROCEDIMIENTOS
	    //LLAMADA A MOSTRAR MENÚ
	    procMostrarMenu();
	    System.out.println("Introduzca una opción:");
	    opcion = sc.nextLine();
	      
	    
	    if  (opcion.equals("1")  || opcion.equals("+")) {
	    //LLAMADA A LA FUNCIÓN SUMA
	    System.out.println("Ha seleccionado la opción de suma");
	    System.out.println("Introduzca el primer número:");
	    num1 = Float.parseFloat(sc.nextLine());
	    System.out.println("Introduzca el segundo número:");
	    num2 = Float.parseFloat(sc.nextLine());
	    resultado = func_sumar (num1, num2);
	    System.out.println("El resultado de la suma de " +num1+ "y" +num2+ "es" + resultado);
	    }
	    
	    else
	    if  (opcion.equals("2")  || opcion.equals("-")) {
	    //LLAMADA A LA FUNCIÓN RESTA
	    System.out.println("Ha seleccionado la opción de resta");
	    System.out.println("Introduzca el primer número:");
		num1 = Float.parseFloat(sc.nextLine());
		System.out.println("Introduzca el segundo número:");
		num2 = Float.parseFloat(sc.nextLine());	
	    resultado = func_restar (num1, num2);
	    System.out.println("El resultado de la resta de " +num1+ "y" +num2+ "es" + resultado);
	    }
	    
	    else
	    if  (opcion.equals("3")  || opcion.equals("*")) {
	    //LLAMADA A LA FUNCIÓN MULTIPLICACIÓN
	    System.out.println("Ha seleccionado la opción de multiplicación");
	    System.out.println("Introduzca el primer número:");
	    num1 = Float.parseFloat(sc.nextLine());
		System.out.println("Introduzca el segundo número:");
		num2 = Float.parseFloat(sc.nextLine());
	    resultado = func_mult (num1, num2);
	    System.out.println("El resultado de la multiplicación de " +num1+ "y" +num2+ "es" + resultado);	
	    }
	    
	    else
	    if  (opcion.equals("4")  || opcion.equals("/")) {
	    //LLAMADA A LA FUNCIÓN DIVISIÓN
	    System.out.println("Ha seleccionado la opción de división");
	    System.out.println("Introduzca el primer número:");
		num1 = Float.parseFloat(sc.nextLine());
		System.out.println("Introduzca el segundo número:");
		num2 = Float.parseFloat(sc.nextLine());
	    resultado = func_div (num1, num2);
	    System.out.println("El resultado de la división de " +num1+ "y" +num2+ "es" + resultado);
	    }
	    
	    else
	    if  (opcion.equals("5")  || opcion.equals("!")) {
	    //LLAMADA A LA FUNCIÓN FACTORIAL
	    
	    System.out.println("Ha seleccionado la opción de factorial");
	    System.out.println("Introduzca el número:");
		num1 = Float.parseFloat(sc.nextLine());
	    if(num1<=0) {
	    System.out.println("Error, valor no válido. Introduzca un valor superior a 0");
	    }else {
	    
	    resultado = func_fact (num1);
	    System.out.println("El factorial de" +num1+ "es"+resultado);
	   		
	    }
	    }
	    }while  (!opcion.equals("0") && !opcion.equals("S") && !opcion.equals("s"));
	    System.out.println("El programa ha finalizado");
	    
	}
	   /**BLOQUE DE FUNCIONES Y PROCEDIMIENTOS
	    * 
	            * PROCEDIMIENTO QUE MUESTRA EL MENÚ
	            * Procedimiento que muestra el menú de opciones de la calculadora
		        */	
		        public static void procMostrarMenu()   {

			    System.out.println("============ CALCULADORA :: GESTIÓN DE AGUAS, SL ============");
			    System.out.println("Sumar (+)");
		        System.out.println("Restar (-)");
		        System.out.println("Multiplicar (*)");     
		        System.out.println("Dividir (/)");
		        System.out.println("Factorial (!)");
		        System.out.println("Salir (S o s)");
		        }
		  
		        /*FUNCIÓN DE SUMA
		        * Función que realiza la opción sumar de dos números introducidos por el usuario.
		        */
		        public static float func_sumar (float param1,float param2) {
		        float result;
		        result = param1+param2;	
		        return result; 
		  
		        } 
		    	/*FUNCIÓN DE RESTA
				* Función que realiza la opción restar de dos números introducidos por el usuario.
				*/
				public static float func_restar (float param1,float param2) {
			    float result;
				result = param1-param2;	
				return result; 
			    }
				/*FUNCIÓN DE MULTIPLICACIÓN
				* Función que realiza la opción multiplicar de dos números introducidos por el usuario.
				*/
						        
				public static float func_mult (float param1,float param2) {
				float result;
				result = param1*param2;	
				return result;
		        }
				
				/*FUNCIÓN DE DIVISIÓN
				* Función que realiza la opción división de dos números introducidos por el usuario.
				*/
				public static float func_div (float param1,float param2) {
				float result;
				result = param1/param2;	
				return result; 
				}
				
				/*FUNCIÓN DE FACTORIAL
				* Función que realiza la opción factorial de dos números introducidos por el usuario.
				*/
				public static float func_fact (float param1) {
			    float result;
			    if (param1 == 1) {
			    	return 1;
			    } else {
			    	return param1 * func_fact(param1 - 1);
			    }
			
				}
}
		
			


	
	
	


