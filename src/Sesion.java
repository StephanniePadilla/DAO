import java.lang.reflect.Field;

public class Sesion {

    public static void create(Class cls, Field... fields){
        StringBuffer sb = new StringBuffer();
        sb.append("INSERT INTO ");
        sb.append(cls.getName());
        sb.append(" (");
        for(Field field : fields){
            sb.append(field.getName());
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);  //Borrar la ulima coma
        sb.append(") VALUES (");
        for(Field field : fields){
            //sb.append(field.get);
        }
    }

    public void read(){}

    public void update(){}

    public void delete(){}

}
