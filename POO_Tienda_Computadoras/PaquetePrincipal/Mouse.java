package PaquetePrincipal;

public class Mouse extends DispositivoEntrada{
    // Atributos
    private final int idMouse;
    private static int contadorMouse;

    // Constructor
    public Mouse (String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idMouse = ++contadorMouse;
    }

    // Getters
    public int getIdMouse() {
        return this.idMouse;
    }
    public static int getContadorMouse() {
        return Mouse.contadorMouse;
    }

    // Metodo toString
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Mouse: {");
        sb.append("idMouse: ").append(idMouse).append(", ");
        sb.append(super.toString());
        sb.append("}");
        return sb.toString();
    }
}
