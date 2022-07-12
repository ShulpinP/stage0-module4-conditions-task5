package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int check = year % 4;
        switch (check) {
            default:
                System.out.println("not leap");
                break;
            case (0):
                System.out.println("leap");
                break;
        }
    }
}
