import java.util.Scanner;

public class findhight {
    public static void main(String[] args) {
        int a;
        System.out.print("请输入一个五位数：");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        //最高位
        System.out.println("最高位："+a/10000);
        System.out.println("最低位："+a%10);
    }
}
