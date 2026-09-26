import java.util.Arrays;
import java.util.*;
public class LaputAct11_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Jenna", "Lilah", "Dreight","Tilda", "Jennifer", "Allison"};
        System.out.print("Enter name: ");
        String inputnames = input.nextLine();
        for (String n : names) {
            if (n.equalsIgnoreCase(inputnames)) {
                System.out.print("Name Found!");
                return;
}
}
        	System.out.print("Not Found!");
}
}	
		    



