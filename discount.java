import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        System.out.println("输入会员积分:");
        Scanner Input = new Scanner(System.in);
        int vip_score = Input.nextInt();
        double discount ;
        if (vip_score < 2000){
            discount = 0.9;
        } else if (2000 < vip_score && vip_score <4000) {
            discount = 0.8;
        } else if (4000 < vip_score && 8000 > vip_score) {
            discount = 0.6;
        }else discount = 0.5;
        System.out.println("你享受的折扣为："+ discount);
    }
}
