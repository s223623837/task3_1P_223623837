package sit707_tasks;

public class CustomDateUtil {
    private int day;
    private int month;
    private int year;

    public CustomDateUtil(int day, int month, int year) {
        if (!isValidDate(day, month, year)) {
            throw new IllegalArgumentException("Invalid date");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void increment() {
        int daysInMonth = getDaysInMonth(this.month, this.year);
        if (this.day < daysInMonth) {
            this.day++;
        } else {
            this.day = 1;
            if (this.month < 12) {
                this.month++;
            } else {
                this.month = 1;
                this.year++;
            }
        }
    }

    public void decrement() {
        if (this.day > 1) {
            this.day--;
        } else {
            if (this.month > 1) {
                this.month--;
                this.day = getDaysInMonth(this.month, this.year);
            } else {
                this.month = 12;
                this.year--;
                this.day = getDaysInMonth(this.month, this.year);
            }
        }
    }

    private boolean isValidDate(int day, int month, int year) {
        if (year < 1700 || year > 9999) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        int daysInMonth = getDaysInMonth(month, year);
        return day >= 1 && day <= daysInMonth;
    }

    private int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }

    private boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%d %s %d", this.day, getMonthName(this.month), this.year);
    }

    private String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }
}
