package meeting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Meeting {

    public static String meeting(String s) {
        String[] guests = s.split(";");
        for (int i = 0; i < guests.length; i++){
            int index = guests[i].indexOf(":");
            guests[i] = "(" + guests[i].substring(index+1).toUpperCase() + ", " + guests[i].substring(0,index).toUpperCase() + ")";
        }
        Arrays.sort(guests);

        return String.join("",guests);
    }
}
