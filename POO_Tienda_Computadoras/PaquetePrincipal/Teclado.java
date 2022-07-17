package PaquetePrincipal;

public class Teclado extends DispositivoEntrada {
    // Atributos
    private final int idTeclado;
    private static int contadorTeclado;

    // Constructor
    public Teclado (String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++contadorTeclado;
    }

    // Getters
    public int getIdTeclado() {
        return idTeclado;
    }
    public static int getContadorTeclado() {
        return Teclado.contadorTeclado;
    }

    // Metodo toString
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado: {");
        sb.append("idTeclado: ").append(idTeclado).append(", ");
        sb.append(super.toString());
        sb.append("}");
        return sb.toString();
    }
}
