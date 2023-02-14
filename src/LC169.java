import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC169
{


    public static void main(String[] args) {
    int [] nums =new int []{2,2,1,1,1,2,2};
    LC169 test= new LC169();
        System.out.println(test.majorityElement(nums));
        System.out.println(test.majorityElement1(nums));
    }
    public  int majorityElement(int[] nums) {
        /*
        方法一: 脑筋急转弯   由于是寻找数组中的众数（并且数量要大于数组长度的一半）
        所以在排序过后数组 n/2的地方一定是众数
        */
        int n= nums.length;
        Arrays.sort(nums);
        return nums[n/2];

    }
    public int majorityElement1(int[] nums) {
            /*
            方法二  哈希表   使用哈希映射来进行确定出现次数
            一个键值对为一个元素和一个元素出现的次数 键为元素  值为出现的次数
             */
                Map<Integer, Integer> counts = countNums(nums);

                Map.Entry<Integer, Integer> majorityEntry1 = null;
                for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
                    if (majorityEntry1 == null || entry.getValue() > majorityEntry1.getValue()) {
                        majorityEntry1 = entry;
                    }
                }

                return majorityEntry1.getKey();
            }
    private Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                counts.put(num, counts.get(num) + 1);
            }
        }
        return counts;
    }

}





