import java.util.Arrays;

public class ArraysHomework {

    public static void main(String[] args) {
        int summ = 0;
        int summ2 = 0;
        double minNumber = 0;
        int maxNumber = 0;
        int counter = 0;
        int[] nums = new int[] {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int[][] nums2 = new int[][] {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        double[][] nums3 = new double[][] {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};


        // tasks 1-4

        for (int i = 0; i < nums.length; i++) {
            summ += nums[i];
        }
        System.out.println("sum = " + summ);

        Arrays.sort(nums);
        System.out.println("min = " + nums[0]);
        System.out.println("max = " + (nums.length-1));
        System.out.println("average = " + (summ / nums.length));

        //tasks 5-7
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j++) {
                // sum all array element
                summ2 += nums2[i][j];
                // count all array element
                counter += 1;
                // maximum array element
                if (maxNumber <= nums2[i][j]) {
                    maxNumber = nums2[i][j];
                } else {
                    continue;
                }
            }
        }
        // min array element
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums3[i].length; j++) {
                // maximum array element
                if (minNumber >= nums3[i][j]) {
                    minNumber = nums3[i][j];
                } else {
                    continue;
                }
            }
        }
        System.out.println("sum = " + summ2);
        System.out.println("max = " + maxNumber);
        System.out.println("min = " + minNumber);
        System.out.println("count = " + counter);


    }


}



