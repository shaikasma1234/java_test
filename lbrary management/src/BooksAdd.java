package books;

import java.util.*;

class book {

        public String bookName;
        public String authorName;
        public int bookId;
        boolean issued;
        Date d1;
        public  book(String a, int b, String c, boolean d,Date e){
            this.bookName=a;
            this.bookId=b;
            this.authorName=c;
            this.issued=d;
            this.d1=e;

        }
    public String getBookName() {

            return bookName;
    }

    public void setBookName(String bookName) {

            this.bookName = bookName;
    }

    public String getAuthorName() {

            return this.authorName;
    }

    public void setAuthorName(String authorName) {

            this.authorName = authorName;
    }

    public int getBookId() {

            return bookId;
    }

    public void setBookId(int bookId) {

            this.bookId = bookId;
    }

    public boolean isIssued() {

            return issued;
    }

    public void setIssued(boolean issued) {

            this.issued = issued;
    }

    public Date getD1() {

            return d1;
    }

    public void setD1(Date d1) {
        this.d1 = d1;
    }

        public boolean bookAvailable(){
            if (issued == true){
                return false;
            }
            else{
                return true;
            }
        }
        public double Fine(Date d3){
            long daysDifferent;
            daysDifferent = d1.getTime()-d3.getTime();
            System.out.println(daysDifferent);
            int days =(int)(daysDifferent/(24*60*60*1000));
            System.out.println(days);
            double fine=10;
            if (days >= 10 && days<15){
                return (fine+=days*2);
            }
            else if(days >= 15 && days <30){
                return (fine+=10+(days-15)*5);
            }
            else if (days >= 30){
                return (fine+=(75+(days-30)*100));
            }
            return 0;

        }


    }
    public class BooksAdd {
        HashMap<Integer, book> m = new HashMap<Integer, book>();

        @Override
        public String toString() {
            return "BooksAdd{" +
                    "m=" + m +
                    '}';
        }
        book seachTheBook(String booksNmae, HashMap<Integer, book> booksLish){
            for(int key: booksLish.keySet())
            {
                if(booksLish.get(key).getBookName().equalsIgnoreCase(booksNmae)){
                    return booksLish.get(key);
                }
            }
            return null;

        }

        public static void main(String[] args) {
            BooksAdd n = new BooksAdd();

            Date d2 = new Date(2019, 06, 17);
            Date d3 = new Date(2019, 01, 21);
            Date d4 = new Date(2018, 01, 14);
            Date d5 = new Date(2018, 07, 12);
            Date d = new Date();
            System.out.println(d.getDate());
            book book1 = new book("Book1", 01, "a", true, d2);
            System.out.println((book1.bookAvailable() ? "True" : "False"));


            System.out.println(book1.Fine(d));
            book b1 = new book("Book2", 02, "b", true, d3);
            book b2 = new book("Book3", 03, "c", false, d4);
            book b3 = new book("Book4", 04, "d", true, d5);
            n.m.put(0, b1);
            n.m.put(1, b2);
            n.m.put(2, b3);
            ArrayList<book> arr = new ArrayList<book>();
            arr.add(book1);
            arr.add(b1);
            arr.add(b2);
            arr.add(b3);
            Comparator<book> m = new Comparator<book>() {
                @Override
                public int compare(book o1, book o2) {
                    return o1.getAuthorName().compareTo(o2.getAuthorName());
                }
            };

            Collections.sort(arr,m);
            for(book values : arr){
                System.out.println(values.authorName);
                }

            System.out.println("Book name? : ");
            Scanner in1 = new Scanner(System.in);
            String getMybook = in1.nextLine();
            System.out.println(n.seachTheBook(getMybook,n.m));
            }



    }
