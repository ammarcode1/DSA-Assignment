public class ClosestToZeroOptimal {
    public static int findClosestNumber(int[] nums) {
        // here time complexity is O(n) bcz we are traversing each element of array one by one.
        int result = nums[0];
        for (int number : nums){
            int a = Math.abs(number);
            int b = Math.abs(result);
            if(a < b || (a == b && number > result)){
                result = number;
            }
        }
        return result;
    }

    static void main() {
        // its a brute force method bcz traverse array using loop.
        int[] arr1 = {-4, -2, 1, 4, 8, 10};
        int a = findClosestNumber(arr1);
        System.out.println(a);
        int[] arr2 = {-2,2};
        int b = findClosestNumber(arr2);
        System.out.println(b);
    }
}