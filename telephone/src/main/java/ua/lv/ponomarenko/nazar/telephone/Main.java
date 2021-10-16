package ua.lv.ponomarenko.nazar.telephone;

public class Main {
    public static void main(String[] args) {
Phone samsung = new Samsung();
samsung.display();
Samsung nokia = new Nokia();
nokia.display();
SamsungPhone samsungphone = new SamsungPhone();
samsungphone.videoRecording();
samsungphone.takeAPhoto();
samsungphone.call();
samsungphone.sendAMessage();
NokiaPhone nokiaphone = new NokiaPhone();
        nokiaphone.call();
        nokiaphone.sendAMessage();
    }
}
