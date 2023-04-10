interface fufu{
    int k=2;
    String l="hihi";
     void show();
     void hide();

}
class fufufu implements fufu{
    public void show(){
        System.out.println("show ur bag");
    }
    public void hide(){
        System.out.println(k);
    }

}


public class interfacenow {
    public static void main(String[]args){
fufu f=new fufufu();
f.hide();f.show();



    }
}
