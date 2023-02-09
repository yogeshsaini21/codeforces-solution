import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i=0;i<n;i++) {
            num[i] = sc.nextInt();
        }
        // ================
        System.out.println(Arrays.toString(num));
        // find number of subset

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        for (int i : num) {
            int size = res.size();
            for (int j = 0; j < size; j++) {
                List<Integer> temp = new ArrayList<>(res.get(j));
                temp.add(i);
                res.add(temp);

            }

        }
        System.out.println(res);
    }
}
