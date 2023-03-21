import java.util.Scanner;

public class TraversalString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一串字符串：");
        String st=sc.nextLine();
        int letter=0,digit=0,space=0,other=0;
       /* char ch[]=st.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&&ch[i]<='z') letter++;
            else if (ch[i]>='0'&&ch[i]<='9') digit++;
            else if(ch[i]==' ') space++;
            else other++;
        }*/
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(Character.isLetter(ch)) letter++;
            else if(Character.isDigit(ch)) digit++;
            else if(Character.isWhitespace(ch)) space++;
            else other++;
        }
        System.out.println("letter="+letter+"digit="+digit+"space="+space+"other="+other);

    }
}
