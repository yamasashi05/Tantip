public class TestDate {
    public static void main(String[] args) {
        //crete object d1 call method in Class Date
        Date d1 = new Date(2025, 8, 2);
        //System.out.println(d1.toString());
        System.out.println(d1); //call toString() method

        d1.setYear(2024);
        d1.setMonth(12);
        d1.setDay(23);
        System.out.println(d1); //call toString() method

        System.out.println("Year is "+ d1.getYear());
        System.out.println("Month is "+ d1.getMonth());

        d1.setDate(2023, 1, 25);
        System.out.println(d1); //call toString() method

    }
}