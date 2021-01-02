package demo01;

public class demo04bianli {
    public static void main(String[] args) {
        int[] array = {3, 5, 6, 8, 9};
        System.out.println(array);
        printArray(array);
        System.out.println("======AAA======");
    }

    public static void printArray(int[] array) {
        System.out.println("printArrray方法收到的参数是：");
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}



