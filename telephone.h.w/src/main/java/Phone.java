public class Phone {
    String name;
String model;
int storageCapacity;
int amountOfRAM;
public Phone(String name,String model,int storageCapacity,int amountOfRAM){
this.name = name;
this.model = model;
this.storageCapacity = storageCapacity;
this.amountOfRAM = amountOfRAM;

}

    public static void main(String[] args) {
        Phone Samsung = new Phone("Samsung, ", "Galaxy S21, ", 256, 8); {
        }
        Phone Nokia = new Phone("Nokia, ", "X20, ", 128, 8); {}
        System.out.println(Samsung.name + Samsung.model + Samsung.storageCapacity+ ", " + Samsung.amountOfRAM);
        System.out.println(Nokia.name + Nokia.model + Nokia.storageCapacity+ ", " + Nokia.amountOfRAM);
        SamsungPhone samsungPhone = new SamsungPhone();
        samsungPhone.videoRecording();
        samsungPhone.takeAPhoto();
        samsungPhone.call();
        samsungPhone.sendAMessage();
        NokiaPhone nokiaphone = new NokiaPhone();
        nokiaphone.call();
        nokiaphone.sendAMessage();
    }



}

