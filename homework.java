import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        System.out.println("我行我素购物系统");
        System.out.println("客户信息管理");
        System.out.println("添加购物信息");
        System.out.println("请输入会员号（<四位整数>）：");
        Scanner input = new Scanner(System.in);
        int vip = input.nextInt();
        System.out.println("请输入会员生日（月/日<用两位数数表示>）：");
        Scanner input_1 = new Scanner(System.in);
        int vip_brith = input_1.nextInt();
        System.out.println("请输入积分：");
        Scanner input_2 = new Scanner(System.in);
        int vip_score = input_2.nextInt();
        System.out.println("已录入的会员信息是：");
        System.out.println(vip+"    "+vip_brith+"    "+vip_score);
    }
}