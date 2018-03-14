<<<<<<< Updated upstream
import java.lang.reflect.Field;
=======
package src;
>>>>>>> Stashed changes

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
            sb.append(obj.getClass().);
            sb.append(", ");
        }
        sb.setLength(sb.length() - 1);  //Borrar la ulima coma
        sb.append(");");
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
         delete.append("WHERE id=");
         delete.append(nombre);
    }

}
