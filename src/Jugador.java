public class Jugador {

    private String nombre;
    private int edad;
    private int dorsal;

    public Jugador(String nombre, int edad, int dorsal){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setDorsal(dorsal);
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
