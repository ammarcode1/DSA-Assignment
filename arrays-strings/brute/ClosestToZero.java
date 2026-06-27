public class ClosestToZero {
    public static int findClosestNumber(int[] nums) {
        // here time complexity is O(n) bcz we are traversing each element of array one by one.
        int result = nums[0];
        for (int i = 0; i < nums.length; i++){
            int a = Math.abs(nums[i]);
            int b = Math.abs(result);
            if(a < b || (a == b && nums[i] > result)){
                result = nums[i];
            }
        }
        return result;
    }

    static void main() {
        // its a brute force method bcz traverse array using loop.
        int[] arr1 = {-4, -2, 1, 4, 8};
        int a = findClosestNumber(arr1);
        System.out.println(a);
        int[] arr2 = {-2,2};
        int b = findClosestNumber(arr2);
        System.out.println(b);
    }
}