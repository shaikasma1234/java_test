public class split {
public static void main(String[] args){
    String text="hello! today is monday";
    String[] item=text.split(" ");
    int itemcount=item.length;
    System.out.println("the number of items is: " + itemcount);
}
}
