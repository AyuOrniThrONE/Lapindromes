import java.util.Scanner;

public class lapindromes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        if (1<=t && t<=100) {
            for (int i = 0; i < t; i++) {
                String str= sc.next();
                String str1="";
                String str2="";
                if (2<=str.length() && str.length()<=1000) {
                    str1=str.substring(0, str.length()/2);
                    if (str.length()%2==0) {
                        str2=str.substring(str.length()/2, str.length());
                    }else{
                        str2=str.substring((str.length()/2)+1, str.length());
                    }
                    char[] c1=str1.toCharArray();
                    char[] c2=str2.toCharArray();
                    java.util.Arrays.sort(c1);
                    java.util.Arrays.sort(c2);

                    if (java.util.Arrays.equals(c1, c2)) {
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
