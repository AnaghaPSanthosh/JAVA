public class App 
{
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Fido", 5, "Golden Retriever");
        animals[1] = new Cat("Fluffy", 3, true);
        animals[2] = new Dog("Buddy", 7, "German Shepherd");
        animals[3] = new Animal("Buddy", 7);
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " says ");
            animal.makeNoise();
            int age = animal.getAge();
            System.out.println("Age:"+age);
            if (animal instanceof Dog) {
                Dog aDog = (Dog) animal;
                String breed    = aDog.getBreed();
                System.out.println("Bred:"+breed);
            } else if (animal instanceof Cat) {
                Cat aCat= (Cat) animal;
                boolean outdoor = aCat.isOutdoor();
                System.out.println("outdoor:"+outdoor);
            }
            System.out.println();
        }
    }
}


class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void makeNoise() {
        System.out.println("Some animal noise");
    }
}


class Dog extends Animal {
    private String breed;
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    @Override
    public void makeNoise() {
        System.out.println("Woof!");
    }
}
class Cat extends Animal {
    private boolean isOutdoor;
    public Cat(String name, int age, boolean isOutdoor) {
        super(name, age);
        this.isOutdoor = isOutdoor;
    }
    public boolean isOutdoor() {
        return isOutdoor;
    }
    @Override
    public void makeNoise() {
        System.out.println("Meow!");
    }
}
