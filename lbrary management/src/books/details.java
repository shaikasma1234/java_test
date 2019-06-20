package books;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
 class book {
     int bookid;
     String bookname;
     String author;
     Date issued_date;
     Date till_date;
     int fine;

    void book(int id, String book_name, String author, Date issued_date, Date till_date) {
        this.bookid = id;
        this.bookname = book_name;
        this.author = author;
        this.issued_date = issued_date;
        this.till_date = till_date;
        System.out.println(this.bookid);
        System.out.println(this.bookname);
        System.out.println(this.author);
        System.out.println(this.issued_date);
        System.out.println(this.till_date);

    }
}
class details {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int bid = sc.nextInt();
        String bname = sc.next();
        String aname = sc.next();
        try {
            String d1 = sc.nextLine();
            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(d1);

            String d2 = sc.nextLine();
            Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(d2);
            book b1 = new book();
            b1.book(bid, bname, aname, date1, date2);

        } catch (ParseException p) {
        }
    }




           /* Scanner sc=new Scanner(System.in);
            System.out.println("enter details");
            int id=sc.nextInt();
            System.out.println();
            String bookname=sc.nextLine();
            date issued_date=sc.nextLine();
            date till_date=sc.nextLine();
            book
*/
    }



