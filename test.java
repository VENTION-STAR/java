public class test {
    public static void main(String[] args) {
        int t_shirt = 490;
        int shoe    = 570;
        int pai     = 320;
        double discount     = 0.8;
        int t_shirt_no =  1;
        int shoe_no    =  1;
        int pai_no     =  1;

        double prise = (t_shirt_no*t_shirt+shoe_no*shoe+pai_no*pai)*discount;
        double return_prise= 1500 - prise;
        System.out.println("***********消费单************");
        System.out.println("购买物品\t"+"单价\t"+"个数\t"+"金额\t");
        System.out.println("T恤衫\t490\t1\t490");
        System.out.println("网球鞋\t570\t1\t570");
        System.out.println("网球拍\t320\t1\t320");
        System.out.println("折扣：8折");
        System.out.println("消费总金额："+prise+"￥");
        System.out.println("找回："+return_prise+"￥");

    }
}
