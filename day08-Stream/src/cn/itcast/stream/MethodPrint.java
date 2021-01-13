package cn.itcast.stream;

import java.awt.print.PrinterGraphics;

public class MethodPrint {

    public static void main(String[] args) {
        printString("Hello", MethodObjectDemo01::printUpperCase);
    }

    private static void printString(String s, Printable p) {
        p.print(s);
    }
}
