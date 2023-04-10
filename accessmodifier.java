class empl{
    private int n;
    private String name;

public empl(String myname){
    n= 45;
    name=myname;
}


    public void setid(int i){
     n=i;
    }
    public int getid(){
        return n;
    }

    public void setname(String w){
        name=w;
    }
    public String getname(){
        return name;
    }
}


public class accessmodifier {
    public static void main(String[]args){

empl shriesh= new empl("shrieshwa");

//shriesh.setid(5);
System.out.println(shriesh.getid());
//shriesh.setname("shriesh tripathi");
System.out.println(shriesh.getname());



    }
}
