public class Dog extends Animal implements move{
    private String name;

    public Dog(double weigh, double height, String name) {
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
    public void motion(String walk) {
        System.out.println("dog Bars " + walk );
    }

    @Override
    public void voice() {
            System.out.println( "Dog talking \"woof\" ");

    }

    @Override
    public String toString() {
        return "name = " + name  +
                ", " + super.toString();
    }


}
