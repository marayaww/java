package cn.itcast.Iteretor;

public class sum100 {
    public static void main(String[] args) {
        int sum = getSum(3);
        System.out.println(sum);
    }

    private static int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getSum(n - 1);
        }

    }
}
