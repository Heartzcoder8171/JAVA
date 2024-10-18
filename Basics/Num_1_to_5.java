import java.util.*;
public class Num_1_to_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        // for(int i=1; i<=n; i++){
        //     System.out.println(i + " ");
        // }
        // System.out.println("good");
        // while(num<=n){
        //     System.out.println(num);
        //     num+=1;
        // }
        do{
            System.out.println(num);
            num+=1;
        }while(num<=n);
    }
}
