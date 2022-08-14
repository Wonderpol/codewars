package meeting;

public class Meeting {
    public static String meeting(String s) {
        final StringBuilder result = new StringBuilder();

        String[] splittedData = s.replaceAll(":", ", ").split(";");

        for (String meeting: splittedData) {
            result.append("(").append(meeting).append(")");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(meeting("Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill"));
    }
}
