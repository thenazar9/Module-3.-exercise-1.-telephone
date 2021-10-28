public class SamsungPhone extends Phone implements PhoneMedia {
private int cameraMgpx;
String color;

    public SamsungPhone(String name, String model, int storageCapacity, int amountOfRAM, int cameraMgpx, String color) {
        super(name, model, storageCapacity, amountOfRAM);
        this.cameraMgpx = cameraMgpx;
        this.color = color;
    }

    public int getCameraMgpx() {
        return cameraMgpx;
    }

    public void setCameraMgpx(int cameraMgpx) {
        this.cameraMgpx = cameraMgpx;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void call(String number) {
        System.out.println( "Samsung calls " + number  );
    }

    @Override
    public void takeAPhoto() {
        System.out.println("Samsung can take a photo");
    }
    public void sendAMessage(String number, String text) {
        super.sendAMessage(number, text);
        System.out.println("Samsung send a message " + text + " to " + number + " from Samsung" );
    }
    @Override
    public void videoRecording() {
        System.out.println("Samsung can take a video");
    }

    @Override
    public String toString() {
        return
                "camera mgpx = " + cameraMgpx +
                ", color= " + color  +
                ", " + super.toString();
    }
}
