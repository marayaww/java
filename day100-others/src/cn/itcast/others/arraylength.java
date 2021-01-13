package demo01;

public class arraylength {
    public static void main(String[] args) {
        int[] arrayA = new int[]{2, 3, 12,};
        System.out.println(arrayA[0]);
        int[] arrayB = new int[]{2, 4, 7, -12, 160, 8};
        int len = arrayB.length;
        System.out.println(len);
        System.out.println("=====================");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(arrayB[i]);
        }
        System.out.println("===========");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(arrayB[i]);
        }
        System.out.println("============");
        int mi = arrayB[0];
        for (int i = 0; i < arrayB.length; i++) {
            if (arrayB[i] < mi) {
                mi = arrayB[i];
            }
        }
        System.out.println("最大值是：" + mi);
        System.out.println("============");
        for (int min = 0, max = arrayB.length - 1; min < max; min++, max--) {//条件判断 min < max,结果是相当于
            int temp = arrayB[min];
            arrayB[min] = arrayB[max];
            arrayB[max] = temp;
        }
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(arrayB[i]);
        }

    }
}
