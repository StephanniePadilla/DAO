import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Sesion {

    public static void insert(Object obj){
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

    public void read(){}

    public void update(){}

    public void delete(){}

}
