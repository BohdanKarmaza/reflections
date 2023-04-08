import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException {
        Animal animal = new Animal();

        Class<? extends Animal> animalClass = animal.getClass();
        Field familyField = animalClass.getDeclaredField("family");
        Field ageField = animalClass.getDeclaredField("age");
        Field colorField = animalClass.getDeclaredField("color");

        familyField.setAccessible(true);
        ageField.setAccessible(true);
        colorField.setAccessible(true);

        familyField.set(animal, "chordate");
        ageField.set(animal, 2);
        colorField.set(animal, "red");

        System.out.println(ageField.get(animal));
        System.out.println(familyField.get(animal));
        System.out.println(colorField.get(animal));

        ClassInfo.printClassInfo("Animal");
    }
}
