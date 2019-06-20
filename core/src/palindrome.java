public class palindrome {
    public static void main(String[] args) {
        int rem,sum=0,temp,n=151;
        temp=n;
        while(n>0){
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("given number is palindrome");
        }
        else
        {
            System.out.println("given number is not palindrome");
        }
    }
}
