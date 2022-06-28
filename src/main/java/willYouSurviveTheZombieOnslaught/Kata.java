package willYouSurviveTheZombieOnslaught;

public class Kata {
    public static String zombieShootout(int zombies, int range, int ammo) {
        int seconds = range * 2;

        if (ammo < zombies) return "You shot %d zombies before being eaten: ran out of ammo.".formatted(ammo);
        if (seconds < zombies) return "You shot %d zombies before being eaten: overwhelmed.".formatted(seconds);

        return "You shot all %d zombies.".formatted(zombies);
    }
}
