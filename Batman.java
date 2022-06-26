import java.util.*;
public class Batman {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of criminal");
        int cri_num = sc.nextInt();
        if (cri_num<5)
          System.out.println("I got this");
        else  if (cri_num>5 && cri_num<10)
          System.out.println("Help me BatMan");
        else 
          System.out.println("Good Luck out there");
    }
}