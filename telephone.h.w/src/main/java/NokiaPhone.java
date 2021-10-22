public class NokiaPhone implements PhoneConnection {

    @Override
    public void call() {
        System.out.println("Nokia can call");
    }

    @Override
    public void sendAMessage() {
        System.out.println("Nokia can send a messages");
    }
}
