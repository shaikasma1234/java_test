package books;

class author {
    String authorname;
    String bookname;

    author(String n,String m){
        authorname=n;
        bookname=m;
    }
    void display(){
        System.out.println(authorname+ " " + bookname);
    }
    public static void main(String[] args){
        author a=new author("x","dp");
        author b=new author("y","cao");
        author c=new author("z","dp");
        a.display();
        b.display();
        c.display();
    }



}
