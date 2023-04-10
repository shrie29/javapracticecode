public class arraynaya {
    public static void main(String[]args){
        int []marks= new int[5];
        marks[0]=55;
        marks[1]=66;
        marks[2]=45;
        marks[3]=54;
        marks[4]=25;
        System.out.println(marks[4]);

        int []mark= {1,2,556,4,5,6};
        System.out.println(mark.length);

        /*for(int i=0;i<=mark.length;i++){
            System.out.println(mark[i]);


        }*/char []str= {'S','H','R','I','E','S','H'};
        System.out.println("naya");
        for(int i=mark.length-1;i>=0;i--){
            System.out.println(mark[i]);}
        System.out.println("nay naya naya");
        for(int element: mark){
            System.out.println(element);
        }
        for(char element: str){System.out.print(element);}

    }
}
