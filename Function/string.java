public class string {
    public static void main(String[] args) {
        // String s = greet();
        String s1 = my_greet("Teena Sharma");
        System.out.println(s1);
    }
    // public static String greet(){
    //     return "how are you";
    // }
    public static String my_greet(String name){
        String name_1 = "Hy " + name;
        return name_1;
    }
}