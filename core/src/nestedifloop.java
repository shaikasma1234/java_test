public class nestedifloop {
    public static void main(String[] args) {
        int age = 18;
        int weight = 80;
        if (age >=20) {
            if (weight > 50) {
                System.out.println("eligible for donating");
            } else {
                System.out.println("not eligible");
            }
        } else {
            System.out.println("age must be greater than 20");
        }
    }
}
