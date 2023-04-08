import java.lang.reflect.*;

public class ClassInfo {

    public static void printClassInfo(String className) throws ClassNotFoundException {
        Class<?> cls = Class.forName(className);

        System.out.println("Назва класу: " + cls.getName());
        System.out.println("Батьківський клас: " + cls.getSuperclass());
        System.out.println("Модифікатори доступу: " + Modifier.toString(cls.getModifiers()));

        Field[] fields = cls.getDeclaredFields();
        System.out.println("Поля класу:");
        for (Field field : fields) {
            System.out.println("\tНазва поля: " + field.getName());
            System.out.println("\tТип поля: " + field.getType().getName());
            System.out.println("\tМодифікатори доступу: " + Modifier.toString(field.getModifiers()));
        }

        Method[] methods = cls.getDeclaredMethods();
        System.out.println("Методи класу:");
        for (Method method : methods) {
            System.out.println("\tНазва методу: " + method.getName());
            System.out.println("\tТип повернення: " + method.getReturnType().getName());
            System.out.println("\tМодифікатори доступу: " + Modifier.toString(method.getModifiers()));
        }
    }
}
