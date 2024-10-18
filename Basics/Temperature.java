import java.util.*;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float temp = sc.nextFloat();
        Float temp_F = (temp*9/5) + 32;
        System.out.println(temp_F);
    }
}