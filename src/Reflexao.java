import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflexao{
    public static void listarAtributosEMetodos(Object obj) {
        Class<?> classe = obj.getClass();

        System.out.println("Classe: " + classe.getName());
        System.out.println("Atributos:");
        Field[] fields = classe.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(" - " + field.getName() + " (" + field.getType().getName() + ")");
        }


        System.out.println("Métodos:");
        Method[] methods = classe.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(" - " + method.getName() + " (Retorno: " + method.getReturnType().getName() + ")");
        }


        Class<?> superClass = classe.getSuperclass();
        while (superClass != null && superClass != Object.class) {
            System.out.println("\nClasse Pai: " + superClass.getName());


            System.out.println("Atributos:");
            Field[] superFields = superClass.getDeclaredFields();
            for (Field field : superFields) {
                System.out.println(" - " + field.getName() + " (" + field.getType().getName() + ")");
            }


            System.out.println("Métodos:");
            Method[] superMethods = superClass.getDeclaredMethods();
            for (Method method : superMethods) {
                System.out.println(" - " + method.getName() + " (Retorno: " + method.getReturnType().getName() + ")");
            }
            superClass = superClass.getSuperclass();
        }
    }

    public static void main(String[] args) {
        Filho filho = new Filho();
        Pai pai = new Pai();
        Avo avo = new Avo();
        listarAtributosEMetodos(filho);
    }
}
