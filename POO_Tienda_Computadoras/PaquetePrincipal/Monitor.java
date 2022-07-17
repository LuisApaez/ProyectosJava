package PaquetePrincipal;

public class Monitor {
    // Atributos
    private final int idMonitor;
    private String marca;
    private double tamagno;
    private static int contadorMonitor;

    // Constructor
    private Monitor(){
        this.idMonitor = ++contadorMonitor;
    }
    public Monitor(String marca, double tamagno){
        this();
        this.marca = marca;
        this.tamagno = tamagno;
    }

    // Getters
    public int getIdMonitor() {
        return this.idMonitor;
    }
    public String getMarca() {
        return this.marca;
    }
    public double getTamagno() {
        return this.tamagno;
    }
    public static int getContadorMonitor() {
        return Monitor.contadorMonitor;
    }

    // Metodo toString
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor: {");
        sb.append("IdMonitor: ").append(this.idMonitor).append(", ");
        sb.append("Marca: ").append(this.marca).append(", ");
        sb.append("Tamagno: ").append(this.tamagno);
        sb.append("}");
        return sb.toString();
    }
}
