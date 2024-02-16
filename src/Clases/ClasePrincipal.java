
package Clases;


public class ClasePrincipal {
    public static void main(String[] args) {
        
        Proceso1  hilo1= new Proceso1();
        ProcesoMusica hilo2 = new ProcesoMusica("C:/Users/Sebas/Documents/NetBeansProjects/ProyectoHilos/recursos/cancionjava.wav");
        
        hilo1.start();
        hilo2.start();
    }
}
