package demo01;

public class demo03HundredSum {
    public static void main(String[] args) {
        int sum3 = 0;
        int j = 2;
        while (j <= 100) {

            sum3 += j;

            ++j;
            j++;
        }
        System.out.println(sum3);
    }
}


