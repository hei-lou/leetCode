import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tan
 * @version 1.0
 * @description:
 * @date 2021/4/9 11:04
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2, 5, 81, 38, 1, 3}, 8);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] arr, int target){
        if(arr == null || arr.length == 1){
            return null;
        }
        Map<Integer, Object> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = target - arr[i];
            if(map.containsKey(num)){
                return new int[]{arr[i], target - arr[i]};
            }else{
                map.put(arr[i], null);
            }
        }
        return null;
    }

}
