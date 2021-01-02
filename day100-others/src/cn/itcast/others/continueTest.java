package demo01;

public class continueTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
//                continue;
                break;
            }
            System.out.println("Hello" + i);
        }
    }
}