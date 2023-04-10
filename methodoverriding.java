package com.companys;
class first{
    int i;
    int j;
    public int met(int x){
        return i;
    }
    first(){
        System.out.println("i'm onnn..");
    }
}
class second extends first{
    public void met(){
        System.out.println(+i);
    }
}



public class methodoverriding {
    public static void main(String[]args){

first f=new first();
second s= new second();
f.i=45;
s.met(1);

    }
}
