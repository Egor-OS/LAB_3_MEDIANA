
import java.util.Scanner;

public class Menu {
    Scanner in = new Scanner(System.in);
    arr ob = new arr();
    hz ob2 = new hz();
    mediana ob3 = new mediana();

    public void menu(int[] arr) {
        if (arr.length != 0) {
            ob3.med(arr);
        }

        ob2.show(arr);
        System.out.println("=============== \n");
        System.out.println("=============== \nChoice: \n1) Add item. \n2) Del item.  \n...) Exit. \n=============== \n");
        switch(this.in.nextInt()) {
            case 1:
                System.out.println("Enter item: ");
                int element = this.in.nextInt();
                this.menu(ob.add_arr(arr, element));
                break;
            case 2:
                this.menu(ob.del_arr(arr));
                break;

            default:
                break;
        }
    }
}
