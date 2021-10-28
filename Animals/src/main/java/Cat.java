public class Cat extends Animal implements move{
    private String name;

    public Cat(double weigh, double height, String name) {
        super(weigh, height);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("meow");
    }

    @Override
    public String toString() {
        return "name='" + name  +
                ", " + super.toString();
    }

    @Override
    public void motion(String walk) {
        System.out.println("cat Kamaz " + walk );
    }
}
