package Clases;

import java.util.Scanner;

public class Proceso1 extends Thread {
    
    @Override
    public void run(){
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingresa un número (o '0' para salir): ");
            int numero = scanner.nextInt();
            
            if (numero != 0) {
                System.out.println("Número ingresado: " + numero);
            } else {
                continuar = false;
                System.out.println("Saliendo del programa...");
            }
        }
        
        scanner.close();
    }
    }
    

