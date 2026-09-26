import java.util.Arrays;
import java.util.*;
public class Act11_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] laputlist = new int[10];
        for (int i = 0; i < laputlist.length; i++) {
            System.out.print("Enter Value for " +(i+1)+ ": ");
            laputlist[i] = input.nextInt();
        	}
        Arrays.sort(laputlist);
        for (int n : laputlist) {
            System.out.println(n);
}
}
}
