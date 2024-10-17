interface Soundable {
    String sound();
}

class Cat implements Soundable {
    @Override
    public String sound() {
        return "야옹";
    }
}

class Dog implements Soundable {
    @Override
    public String sound() {
        return "멍멍";
    }
}

public class SoundableExample {
    public static void main(String[] args) {
        Soundable cat = new Cat();
        Soundable dog = new Dog();

        System.out.println(cat.sound());
        System.out.println(dog.sound());
    }
}
