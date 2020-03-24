public class hz {
    public hz() {
    }

    public void show(int[] arr) {
        if (arr.length != 0) {
            for(int i = 0; i < arr.length; ++i) {
                System.out.print("[" + arr[i] + "] ");
            }

            System.out.println("");
        }

    }
}
