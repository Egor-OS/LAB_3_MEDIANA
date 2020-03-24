import java.util.Arrays;

public class arr {
    public arr() {
    }

    public static int[] add_arr(int[] arr, int el) {
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = el;
        int counter = newArr.length - 1;
        if (newArr.length != 1) {
            while(counter != 0 && newArr[counter] < newArr[counter - 1]) {
                int xx = newArr[counter - 1];
                newArr[counter - 1] = newArr[counter];
                newArr[counter] = xx;
                --counter;
            }
        }

        return newArr;
    }

    public static int[] del_arr(int[] arr) {
        int[] newArr = Arrays.copyOf(arr, arr.length - 1);
        return newArr;
    }
}
