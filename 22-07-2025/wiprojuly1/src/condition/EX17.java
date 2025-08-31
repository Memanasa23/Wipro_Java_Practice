package condition;

public class EX17 {

    public static void main(String[] args) {
    	
    	enum Month {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
            JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
        }


        Month month = Month.FEBRUARY;

        if (month == Month.FEBRUARY) {
            System.out.println("The month is FEBRUARY.");
        } else {
            System.out.println("The month is not FEBRUARY.");
        }
    }

}
