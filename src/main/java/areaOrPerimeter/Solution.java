package areaOrPerimeter;

class Zwierze{}
class Kot extends Zwierze{
    public static void main(String[] args) {
        Zwierze zwierze = new Kot();
        if (zwierze instanceof Kot) {
            System.out.println("cos");
        }
    }
}
public class Solution {
    public static int areaOrPerimeter (int l, int w) {
        return l == w ? l * w : 2 * w + 2 * l;
    }
    public static void main(String[] args) {

    }
}
