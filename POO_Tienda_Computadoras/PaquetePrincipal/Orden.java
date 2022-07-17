package PaquetePrincipal;

public class Orden {
    // Atributos
    private final int idOrden;
    private Computadora computadoras[];
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;
    private static int contadorOrden;

    // Constructor
    public Orden(){
        this.idOrden = ++Orden.contadorOrden;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    // Metodo para agregar computadoras a la orden
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
        else {
            System.out.println("No se pueden agregar más computadoras a la orden");
        }
    }

    // Metodo para mostrar una orden
    public void mostrarOrden(){
        System.out.println("Orden: #" + this.idOrden);
        for(int i = 0; i < this.contadorComputadoras; i++){
            System.out.println(this.computadoras[i]);
        }
    }

    // Getters
    public int getIdOrden(){
        return this.idOrden;
    }
    public int getContadorComputadoras(){
        return this.contadorComputadoras;
    }
    public static int getContadorOrden(){
        return Orden.contadorOrden;
    }
}
