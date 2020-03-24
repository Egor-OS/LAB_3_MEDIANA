public class mediana {
    public mediana() {
    }

    public void med(int[] arr) {
        double xx;
        if (arr.length % 2 == 0) {
            xx = (double)(arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0D;
        } else if (arr.length != 1) {
            xx = arr[(arr.length + 1) / 2 - 1];
        } else {
            xx = arr[0];
        }

        System.out.println("*** МЕДИАНА --> " + xx + " ***");
    }
}
