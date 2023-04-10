import java.util.Scanner;
public class tcs {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine().toLowerCase();
//char []al= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
boolean []alfa= new boolean[26];
for(int i=0;i<str.length();i++){
    if(str.charAt(i)>='a' && str.charAt(i)<='z'){
        alfa[str.charAt(i)-'a']=true;
    }
}
for(int i=0;i<26;i++){
    if(!alfa[i]){
        System.out.print((char)(i+'a')+" ");
    }
}
    }
}
/*import java.util.*;

public class tcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        boolean[] alphabets = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                alphabets[str.charAt(i) - 'a'] = true;
            }
        }

        System.out.print("Missing Alphabets: ");
        for (int i = 0; i < 26; i++) {
            if (!alphabets[i]) {
                System.out.print((char)(i + 'a') + " ");
            }
 }
}
}*/
