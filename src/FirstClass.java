public class FirstClass {
    public static void main(String[] arg){

        String theMonth = "APR";

        System.out.print("Your birth month owned to " + getQuart(theMonth) + " quarter");
    }

    public static String getQuart(String month) {
        return switch (month) {
            case "JAN","FEB","MAR" -> "1st";
            case "APR","MAY","JUNE" -> "2nd";
            case "JULY","AUG","SEPT" -> "3rd";
            default -> "bad";
        };
    }
}
