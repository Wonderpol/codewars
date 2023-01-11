package killerGarageDoor;

public class Door {
    public static String run(String events) {

        int state = 0, dir = 1;
        boolean moving = false;
        StringBuilder out = new StringBuilder();

        for (int n = 0 ; n < events.length() ; n++) {
            char c = events.charAt(n);

            if (c == 'O')         dir *= -1;
            else if (c == 'P')    moving = !moving;
            if (moving)           state += dir;
            if (state % 5 == 0) {
                moving = false;
                dir = state == 0 ? 1 : -1;
            }
            out.append(state);
        }
        return out.toString();
    }

    public static void main(String[] args) {
        System.out.println(run("P..P...."));
    }
}
