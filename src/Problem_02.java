import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/9/28 20:21
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Problem_02 {
    public static int count1(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                sum++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int k = input.nextInt();
            String str = input.next();
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                for (int j = i; j < str.length(); j++) {
                    int count = count1(str.substring(i,j + 1));
                    if (count == k) {
                        sum++;
                    } if (count > k) {
                        break;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
