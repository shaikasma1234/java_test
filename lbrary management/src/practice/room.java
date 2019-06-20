package practice;
class Building {
    void color()
    {
        System.out.println("Blue");
    }
}
class room extends Building{
    void color() throws NullPointerException
    {
        System.out.println("White");
    }
    public static void main(String args[]){
        Building obj = new room();
        obj.color();
    }
}
