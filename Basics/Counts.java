// import java.util.*;
public class Counts {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int n = 434456;
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem==4){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
