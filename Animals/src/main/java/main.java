public class main {
    public static void main(String[] args) {


        Duck duck = new Duck(0.7,0.14,"Duck");
        System.out.println(duck);
duck.motion("walking");
duck.flight("flying");
duck.voice();

        Dog dog = new Dog(41.5, 0.61, "Bars");
System.out.println(dog);
dog.motion("walking");
dog.voice();

        Cat cat = new Cat(5, 0.20, "Kamaz");
        System.out.println(cat);
        cat.motion("walking");
cat.voice();

    }
}
