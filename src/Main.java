import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int summ = 0;
        int[] nums = new int[] {9, 2, 6, 4, 5, 12, 7, 8, 6};


        for (int i = 0; i < nums.length; i++) {
            summ += nums[i];
        }
        System.out.println("sum = " + summ);

        Arrays.sort(nums);
        System.out.println("min = " + nums[0]);
        System.out.println("max = " + (nums.length-1));
        System.out.println("average = " + (summ / nums.length));

    }


    }