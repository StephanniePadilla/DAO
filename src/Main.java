import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) {
        Jugador j = new Jugador(0, "Sergi", 20, 13);
        try {
            System.out.println(Sesion.insert(j));
            System.out.println(Sesion.delete(j, 0));
            System.out.println(Sesion.read(j, 0));
            System.out.println(Sesion.update(j, 0));
        }
        catch (NoSuchMethodException e){

        }
        catch (IllegalAccessException e){

        }
        catch (InvocationTargetException e){

        }
    }
}
