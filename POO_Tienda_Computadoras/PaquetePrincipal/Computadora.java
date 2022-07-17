package PaquetePrincipal;

public class Computadora {
    // Atributos
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Mouse mouse;
    private static int contadorComputadora;

    // Constructor
    public Computadora() {
        this.idComputadora = ++contadorComputadora;
    }
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Mouse mouse) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
    }

    // Getters
    public int getIdComputadora() {
        return this.idComputadora;
    }
    public String getNombre() {
        return this.nombre;
    }
    public Monitor getMonitor() {
        return this.monitor;
    }
    public Teclado getTeclado() {
        return this.teclado;
    }
    public Mouse getMouse() {
        return this.mouse;
    }
    public static int getContadorComputadora() {
        return Computadora.contadorComputadora;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    // Metodo toString
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Computadora: {");
        sb.append("idComputadora: ").append(this.idComputadora).append(", ");
        sb.append("nombre: ").append(this.nombre).append(", ");
        sb.append("monitor: ").append(this.monitor).append(", ");
        sb.append("teclado: ").append(this.teclado).append(", ");
        sb.append("mouse: ").append(this.mouse);
        sb.append("}");
        return sb.toString();
    }
}
