public class Main {
    public static void main(String[] args) {

        SamsungPhone samsungPhone = new SamsungPhone("Samsung, ", "Galaxy S21, ", 256,
                8,24,"black");
        System.out.println(samsungPhone);
        samsungPhone.videoRecording();
        samsungPhone.takeAPhoto();
        samsungPhone.call("380500000000");
        samsungPhone.sendAMessage("380500000000","\" Good morning!\"");
        NokiaPhone nokiaphone = new NokiaPhone("Nokia, ", "X20, ", 128, 8,
                "grey");
        System.out.println(nokiaphone);
        nokiaphone.call("380999999999");
        nokiaphone.sendAMessage("380999999999", "\"Hello world\"");



    }

}
