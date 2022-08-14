package meeting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Meeting {
//    public static String meeting(String s) {
//
//
//        String[] splittedData = s.replaceAll(":", ", ").split(";");
//        String[] result = new String[splittedData.length];
//
//        for (int i = 0; i < splittedData.length; i++) {
//            result[i] = "(" + splittedData[i].toUpperCase() + ")";
//        }
//
//        Arrays.sort(result);
//
//        return String.join("", result);
//    }

    public static String meeting(String s) {
        String[] guests = s.split(";");
        for (int i = 0; i < guests.length; i++){
            int index = guests[i].indexOf(":");
            guests[i] = "(" + guests[i].substring(index+1).toUpperCase() + ", " + guests[i].substring(0,index).toUpperCase() + ")";
        }
        Arrays.sort(guests);

        return String.join("",guests);
    }

    public static void main(String[] args) {
        System.out.println(meeting("Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill"));
    }
}
