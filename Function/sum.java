import java.util.*;
public class sum{
    public static void main(String[] args) {
        int ans = sum_2();              // return type so put in the integer answer.
        System.out.println(ans);
    }
    public static int sum_2(){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1+n2;
        return sum;
    }
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1+n2;
        System.out.println(sum);
    }
}