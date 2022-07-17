package PaquetePruebas;

import diseño_clases.PaquetePrincipal.*;

public class Simulacion {
    public static void main(String[] args) {
        // Computadora 1:
        // Monitor
        Monitor monitorHP= new Monitor("HP", 13);
        // Teclado
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        // Mouse
        Mouse mouseHP = new Mouse("bluetooth", "HP");
        // Computadora
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, mouseHP);

        // Computadora 2:
        // Monitor
        Monitor monitorDell= new Monitor("Dell", 15);
        // Teclado
        Teclado tecladoDell = new Teclado("USB", "Dell");
        // Mouse
        Mouse mouseDell = new Mouse("USB", "Dell");
        // Computadora
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, mouseDell);

        // Computadora 3:
        // Monitor
        Monitor monitorAsus= new Monitor("Asus", 17);
        // Computadora
        Computadora computadoraAsus = new Computadora("Computadora Asus", monitorAsus, tecladoDell, mouseHP);

        // Orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraAsus);
        orden1.mostrarOrden();
        
        // Numero de computadoras en la orden 1
        System.out.println(orden1.getContadorComputadoras());
        System.out.println(computadoraHP.getMonitor());
    }
}
