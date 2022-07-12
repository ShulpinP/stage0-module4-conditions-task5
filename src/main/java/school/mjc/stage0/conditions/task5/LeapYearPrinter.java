package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int check = year % 4;
        int roundYearCheck = year % 400;
        if (year % 100 == 0) {
            switch (roundYearCheck) {
                default:
                    System.out.println("not leap");
                    break;
                case (0):
                    System.out.println("leap");
                    break;
            }
        } else {
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
}
