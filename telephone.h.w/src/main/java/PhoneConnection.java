public interface PhoneConnection {
    void call(String number);

    default void sendAMessage(String number, String text) {}


}
