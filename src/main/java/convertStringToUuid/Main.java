package convertStringToUuid;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        String testUuid = "eaecabcc-a4f1-486f-9301-8e3cdca7a071";

        final UUID uuid = UUID.fromString(testUuid);
        System.out.println(uuid);
    }
}
