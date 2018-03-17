import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Sesion {

    public static String insert(Object obj){ //función create
        StringBuffer sb = new StringBuffer();
        sb.append("INSERT INTO ");
        sb.append(obj.getClass().getName());
        sb.append(" (");
        for(Field field : obj.getClass().getDeclaredFields()){
            sb.append(field.getName());
            sb.append(", ");
        }
        sb.setLength(sb.length() - 2);  //Borrar la ulima coma
        sb.append(") VALUES (");
        for(Field field : obj.getClass().getDeclaredFields()){
            sb.append("? ");
            //getValue(obj.getClass(), field.getName());
            sb.append(", ");
        }
        sb.setLength(sb.length() - 3);  //Borrar la ulima coma
        sb.append(");");
        return sb.toString();
    }

    private static String getValue (Object obj, String key) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException{

        Method m = obj.getClass().getDeclaredMethod("getName", null);
        Object o = m.invoke(obj, null);
        if (o instanceof String ) {
            String s = (String )o;
            return s;
        }
        return null;
    }

    public static String read(Object obj,int id){ //Te lo lee segun el nombre
        StringBuffer sb = new StringBuffer(); //creo el buffer y empiezo a poner las instancias
        sb.append("SELECT * FROM ");
        sb.append(obj.getClass().getName());
        sb.append(" WHERE id = ");
        //sb.append(id);
        sb.append("?");
        sb.append(";");
        return sb.toString();
    }

    public static String update(Object obj,int id)throws NoSuchMethodException, IllegalAccessException,InvocationTargetException{
        StringBuffer sb = new StringBuffer();
        sb.append("UPDATE ");
        sb.append(obj.getClass().getName());
        sb.append(" SET ");
        for(Field field : obj.getClass().getDeclaredFields()){
            sb.append(field.getName());
            sb.append(" = ");
            //Primera letra del atributo en mayúsculas
            String fieldName = field.getName().substring(0,1).toUpperCase();
            fieldName += field.getName().substring(1);  //Añadir el resto del nombre del atributo
            //Obtener el valor del atributo
            //sb.append(obj.getClass().getDeclaredMethod("get"+fieldName,null).invoke(obj,null));
            sb.append("?");
            sb.append(", ");
        }
        sb.setLength(sb.length()-2);    //Borrar la ultima coma
        sb.append(" WHERE id = ");
        //sb.append(id);
        sb.append("?");
        sb.append(";");
        return sb.toString();
    }

    public static String delete(Object objeto, int id){
        //DROP parametro FROM  clase WHERE id = parametro pasado
        StringBuffer delete = new StringBuffer();
         delete.append("DELETE FROM ");
         delete.append(objeto.getClass().getName());
         delete.append(" WHERE id = ");
         //delete.append (id);
        delete.append("?");
         delete.append(";");
         return delete.toString();
    }

}
