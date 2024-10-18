import java.util.*;
public class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("not prime or not composite");
        }
        int c = 2;
        while(c*c <= n){
            if(n%2==0){
                System.out.println("not prime");
                break;
            }
            c = c+1;
        }
        System.out.println("Prime");
    }
}