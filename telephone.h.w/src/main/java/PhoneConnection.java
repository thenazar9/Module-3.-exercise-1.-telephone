public interface PhoneConnection {
    void call();

    default void sendAMessage() {}


}
