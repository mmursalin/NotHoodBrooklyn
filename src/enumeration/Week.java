package enumeration;

public class Week {
    Day day;
    public Week(){}
    public Week(Day day){
        this.day = day;
    }
    public void whatToDo(Day day){
        switch(day){
            case MONDAY:
                System.out.println("Start working on CodeLab");
                break;
            case TUESDAY:
                System.out.println("Start working on Homework");
                break;
            case WEDNESDAY:
                System.out.println("Join Mentoring session");
                break;
            case THURSDAY:
                System.out.println("join group discussion");
                break;
            case FRIDAY:
                System.out.println("Submit home work, then play soccer");
                break;
            case SATURDAY:
                System.out.println("Join weekend class-1");
                break;
            case SUNDAY:
                System.out.println("Join weekend class-2");
                break;
            default:
                System.out.println("Are you out of your mind ! no more day");
                break;

        }
    }
}