public class Jugador {

    private int idjugador;
    private String nombre;
    private int edad;
    private int dorsal;

    public Jugador(int idjugador, String nombre, int edad, int dorsal){
        this.setIdjugador(idjugador);
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setDorsal(dorsal);
    }

    public int getIdjugador() {
        return idjugador;
    }

    public void setIdjugador(int idjugador) {
        this.idjugador = idjugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
}
