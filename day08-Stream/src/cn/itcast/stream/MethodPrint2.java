package cn.itcast.stream;

public class MethodPrint2 {

    public static void main(String[] args) {
        printString(MethodObjectDemo01::printUpperCase);
    }

    private static void printString(Printable p) {

      p.print("helloWorld");
    }
}
