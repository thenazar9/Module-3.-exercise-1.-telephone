public class NokiaPhone extends Phone {
    String color;

    public NokiaPhone(String name, String model, int storageCapacity, int amountOfRAM, String color) {
        super(name, model, storageCapacity, amountOfRAM);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void call(String number) {
        System.out.println( "Nokia calls " + number  );
    }

    @Override
    public void sendAMessage(String number, String text) {
        super.sendAMessage(number, text);
        System.out.println("Nokia send a message " + text + " to " + number + " from Nokia" );
    }



    @Override
    public String toString() {
        return "color= " + color  +
                ", " + super.toString();
    }
}
