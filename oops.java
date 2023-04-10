package com.company;

class naukari{
    int id;
    String name;
    public void details(){
        System.out.println("my id is: "+id);
        System.out.println("my name is: "+name);
    }
}


public class oops {

    public static void main(String[]args){
        naukari shishir = new naukari();
        shishir.id=45;
        shishir.name="tripathi";
        //System.out.println(shishir.id);
        //System.out.println(shishir.name);
        shishir.details();



    }

}
