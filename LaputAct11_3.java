import java.util.*;
public class LaputAct11_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] laputlist = new int[10];
        int sum = 0;
        for (int i = 0;i<laputlist.length;i++) {
            System.out.print("Enter Value for "+(i+1)+": ");
            laputlist[i] = input.nextInt();
            sum = sum + laputlist[i];
        }
System.out.println("The Sum is: " + sum);
}
}
