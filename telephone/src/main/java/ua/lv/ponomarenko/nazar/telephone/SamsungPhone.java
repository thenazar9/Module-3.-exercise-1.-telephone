package ua.lv.ponomarenko.nazar.telephone;

public class SamsungPhone implements PhoneConnection, PhoneMedia {

    @Override
    public void call() {
        System.out.println("Samsung can call");
    }

    @Override
    public void sendAMessage() {
        System.out.println("Samsung can send a messages");
    }

    @Override
    public void takeAPhoto() {
        System.out.println("Samsung can take a photos");
    }

    @Override
    public void videoRecording() {
        System.out.println("Samsung can shoot video");
    }
}
