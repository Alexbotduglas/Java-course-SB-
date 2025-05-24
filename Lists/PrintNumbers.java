import javax.swing.*;
import java.util.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40};
        ArrayList<Integer> values = new ArrayList<>();
        values.addAll(Arrays.asList(numbers));
        for (Integer value : values) {
            System.out.println(value);
        }
        Integer[] nums = values.toArray(new Integer[0]);
        System.out.println(Arrays.toString(nums));
    }
}


// 10
// 20
// 30
// 40
// [10, 20, 30, 40]
