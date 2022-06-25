package harvestFestival;

/*
plant("@", 3, 3, 25) => "---@@@---@@@---@@@"
Water gives the length of the stem portions between flowers
Water also gives the total number of segments(number of times flowers + stems should be repeated)
Fertilizer gives the length of the flower clusters.
Temperature is in the range of 20°C and 30°C

plant("$", 4, 2, 30) => "----$$----$$----$$----$$"

plant("&", 1, 5, 20) => "-&&&&&"

plant("^", 3, 3, 35) => "---------^"
The temperature is not in the correct range, so all flowers die, except the last one at the end.
The stem is not affected by the temperature
 */

public class Kata {
    public static String plant(char seed, int water, int fert, int temp){
        return temp >= 20 && temp <= 30 ? ("-".repeat(water) + Character.toString(seed).repeat(fert)).repeat(water) : "-".repeat(water * water) + seed;
    }
}
