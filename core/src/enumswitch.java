enum week {
        sunday,monday,tuesday,wednesday,thursday,friday,saturday
    }
    public class enumswitch {
        public static void main(String args[]){
            week w;
            w = week.tuesday;
            switch(w) {
                case sunday:
                    System.out.println("sunday!");
                    break;
                case monday:
                    System.out.println("monday!");
                    break;
                case tuesday:
                    System.out.println("tuesday!");
                    break;
                case wednesday:
                    System.out.println("wednesday!");
                    break;
                case thursday:
                    System.out.println("thursday!");
                    break;
                case friday:
                    System.out.println("friday!");
                    break;
                case saturday:
                    System.out.println("saturday!");
                    break;
                default:
                    System.out.println("what day it is?");
                    break;
            }
        }
    }
