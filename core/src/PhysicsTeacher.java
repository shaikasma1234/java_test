 class Teacher {
        String designation = "Teacher";
        String collegeName = "Beginnersbook";
        void does(){
            System.out.println("Teaching");
        }
    }

    public class PhysicsTeacher extends Teacher{
        String Subject = "Physics";
        public static void main(String[] args){
            PhysicsTeacher obj = new PhysicsTeacher();
            System.out.println(obj.collegeName);
            System.out.println(obj.designation);
            System.out.println(obj.Subject);
            obj.does();
        }
    }

