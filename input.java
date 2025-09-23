import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("请输入：");
        Scanner input  = new Scanner(System.in);
        int Input = input.nextInt();
        System.out.println("你输入的是："+ Input);
    }
}
