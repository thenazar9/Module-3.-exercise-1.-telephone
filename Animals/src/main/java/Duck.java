public class Duck extends Animal implements move, fly {
    private String name;

    public Duck(double weigh, double height, String name) {
        super(weigh, height);
        this.name = name;
    }
public void voice(){
    System.out.println("crya");
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", " + super.toString();
    }

    @Override
    public void motion(String walk) {
        System.out.println("Duck " + walk );
    }

    @Override
    public void flight(String duckFly) {
        System.out.println("Duck " + duckFly );
    }
}
