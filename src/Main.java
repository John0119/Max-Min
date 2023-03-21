import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a[]=new int[10];
        System.out.print("请输入10个整数：");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;++i){
            a[i]=sc.nextInt();
        }
        //求最大值
        int max=0;
        for(int i=0;i<a.length;++i){
            if(max<a[i])
                max=a[i];
        }
        System.out.println("max="+max);
        //求最下值
        int min=a[0];
        for(int i=0;i<a.length;++i){
            if(min>a[i])
                min=a[i];
        }
        System.out.println("min="+min);
    }
}