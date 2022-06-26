package mapOverAListOfLists;

import java.util.Arrays;
import java.util.function.Function;

public class Solution {
    public static <T,R> Object[][] gridMap(Function<T,R> fn, T[][] list){
        return  Arrays.stream(list)
                .map(e -> Arrays.stream(e).map(fn).toArray())
                .toArray(Object[][]::new);
    }

//    public static void main(String[] args) {
//        final Integer[][] num = {{1,2,3,4},{5,6,7,8,9},{0,2,4}};
//        System.out.println(Arrays.deepToString(gridMap(e -> e + 1, num)));
//    }
}
