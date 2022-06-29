package numberOfPeopleInTheBus;

import java.util.ArrayList;

public class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream().mapToInt(stop -> stop[0] - stop[1]).sum();
    }
}
