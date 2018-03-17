public class Main {

    public static void main(String[] args) {
        Jugador j = new Jugador(0, "Sergi", 20, 13);
        System.out.println(Sesion.insert(j));
    }
}
