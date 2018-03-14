<<<<<<< Updated upstream
import java.lang.reflect.Field;
import java.lang.reflect.Method;

package src;


public class Sesion {

    public static void insert(Object obj){ //función create
        StringBuffer sb = new StringBuffer();
        sb.append("INSERT INTO ");
        sb.append(obj.getClass().getName());
        sb.append(" (");
        for(Field field : obj.getClass().getFields()){
            sb.append(field.getName());
            sb.append(", ");
        }
        sb.setLength(sb.length() - 1);  //Borrar la ulima coma
        sb.append(") VALUES (");
        for(Field field : obj.getClass().getFields()){
            sb.append("? ");
            getValue(obj.getClass(), field.getName());
            sb.append(", ");
        }

        sb.setLength(sb.length() - 1);  //Borrar la ulima coma
        sb.append(");");


    }

    private static void getValue(Object obj, String key) {

        Method m = obj.getClass().getDeclaredMethod("getName", null);
        Object o = m.invoke(obj, null);
        if (o instanceof String ) {
            String s = (String )o;
            return s;
        }
    }

    public void read(Class cls, String nombre){ //Te lo lee segun el nombre
        StringBuffer sb = new StringBuffer(); //creo el buffer y empiezo a poner las instancias
        sb.append("SELECT * FROM ");
        sb.append(cls.getName());
        sb.append(" WHERE id=");
        sb.append(nombre);
    }

    public void update(){}

    public void delete(Object objeto, String nombre){
        //DROP parametro FROM  clase WHERE id = parametro pasado
        StringBuffer delete = new StringBuffer();
         delete.append("DELETE FROM");
         delete.append(objeto.getClass().getName());
         String s = objeto.getClass().getFields()[0].getName();
         delete.append("WHERE");
         delete.append (s);
         delete.append("=");
         delete.append(nombre);
    }

}
