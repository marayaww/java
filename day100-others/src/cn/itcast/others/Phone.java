package demo01;

public class Phone {
    String brand;
    double piece;
    String color;

    public void call(String who) {
        System.out.println("给" + who + "打电话");
    }

    public void sendMessages() {
        System.out.println("群发短信");
    }
}
