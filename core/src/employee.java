class employeedetail {
    int id;
    String name;
    float salary;

    void insert(int i, String n, float s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}
public class employee{
    public static void main(String[] args){
        employeedetail e1=new employeedetail();
        employeedetail e2=new employeedetail();
        e1.insert(1,"a",50000);
        e2.insert(2,"b",55000);
        e1.display();
        e2.display();
    }
}
