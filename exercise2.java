import java.util.Scanner;
class library{
    String []input= new String[10];
    String []output= new String[10];
    Scanner scan= new Scanner(System.in);

    public void issuebook(){

        System.out.println("name the book u want to issue");
        for(int i=0;i<=9;i++){
        input[i]=scan.nextLine();
        }
    }
    public void returnbook(){

        System.out.println("name the book u want to return");
        for(int j=0;j<=9;j++){
        output[j]=scan.nextLine();
        }
    }
}

public class exercise2 {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        library l= new library();

while(true) {
    System.out.println("press 1 for issue or 2 for return?");
    int a = scan.nextInt();
    if (a == 1) {
        l.issuebook();

    } else if (a == 2) {
        l.returnbook();
    }
else if(a==0){
    break;
    }
}





    }
}
