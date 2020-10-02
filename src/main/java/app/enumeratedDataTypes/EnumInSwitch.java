package app.enumeratedDataTypes;

// A Java programing to demonstrate working on enum in switch case


// Driver class that contains an object of "day"
public class EnumInSwitch {
    Day day;
    //Constructor
    public EnumInSwitch(Day day ){
        this.day = day;
    }

    // prints a line about Day using switch
    public void dayIsLike(){
        switch (day)
        {
            case MONDAY:
        System.out.println("Monday are bad");
        break;
            case FRIDAY:
        System.out.println("Fridays are better.");
        break;
            case SATURDAY:
            case SUNDAY:
        System.out.println("Weekends are best");
        break;
            default:
        System.out.println("Midweek days are so-so.");

    }
    }
}
