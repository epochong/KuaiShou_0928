import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/9/28 20:34
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Problem_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> arr = new ArrayList <>();
        for (int i = 0; i < n; i++) {
            arr.add(input.nextInt());
        }
        Collections.sort(arr);
        int right = arr.size() - 1;
        while (true) {
            if (arr.size() == 1) {
                break;
            }
            int tem = arr.get(right) - arr.get(right - 1);

            arr.remove(right - 1);
            arr.remove(right - 1);
            arr.add(tem);
            right--;
            Collections.sort(arr);
        }
        System.out.println(arr.get(0));
    }
}
