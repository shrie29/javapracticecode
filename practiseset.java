public class practiseset {
    public static void main(String[]args){
        float []arr={1.2f,2.1f,3.4f,4.6f,5.1f};
        for(float element:arr){
            System.out.println(element);
            }
        float sum=0;
        for(float element:arr){
            sum=sum+element;
        }System.out.println(+sum);
    }
}
