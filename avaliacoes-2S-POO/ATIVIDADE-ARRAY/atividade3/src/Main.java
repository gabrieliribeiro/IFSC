import javax.swing.*;

/**
 *
 * @author gabiszoka
 *
 */
public class Main {
    public static void main(String[] args) {
        Array array = new Array();

        int[] a = new int[15];
        int[] b = new int[15];
        int[] c = new int[15];
        int[] d = new int[15];

        array.startArray(a);
        array.startArray(b);
        array.startArray(c);
        array.startArray(d);

        array.showInfo(a);

        array.allPairs(a);

        array.biggerValue(a);

        array.allEquals(a, b);

        array.multiplyArray(a, b);

        array.sumArray(a, b);

        array.mediaArray(d);

        array.searchArray(a, 44);

    }
}