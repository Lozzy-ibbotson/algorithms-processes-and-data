package practical1;

public class Activity2 {
    /**
     * Activity 2:
     * Create an Enum Type (called Month) that represents the
     * months of the year. Store the current month in a variable
     * (e.g. currentMonth). Add a switch statement that checks the value
     * of currentMonth and prints the corresponding month
     */

    enum Month {Jan, Feb, March, May, June, July, Aug, Sep, Oct, Nov, Dec};

    public static void main(String[] args) {
    Month currentMonth;
    currentMonth = Month.Sep;
        switch (currentMonth){
            case Jan: System.out.println("January is for new beginnings");break;
            case Feb: System.out.println("Feb is Valentines");break;
            case March: System.out.println("March");break;
            case May: System.out.println("May");break;
            case June: System.out.println("June");break;
            case July: System.out.println("July");break;
            case Aug: System.out.println("August");break;
            case Sep: System.out.println("September");break;
            case Oct: System.out.println("October");break;
            case Nov: System.out.println("November");break;
            case Dec: System.out.println("December");break;
            default: System.out.println("unset month");break;
        }
    }
}
