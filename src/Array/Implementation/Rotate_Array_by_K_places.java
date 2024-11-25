package Array.Implementation;

public class Rotate_Array_by_K_places {
    /*
    Here I have implemented 2 solutions
    1. Question-Reminder approach: Work only when, max value of array is < sqRoot(Integer.MAX_VALUE).
    2. Reverse the array approach;
     */

    public void question_reminder_approach(int[] array, int k){
        int max = Integer.MIN_VALUE;
        int kNew = k % array.length;
        max++;
        if(kNew == 0){
            return;
        }

        for(int i = 0; i < array.length - k; i++){
            array[i] = array[i]*max + (array[i+k]);
        }
        for(int i = array.length-k; i < array.length;i++){
            array[i] = array[i- array.length+k]/max;
        }
        for(int i = 0; i < array.length-k; i++){
            array[i] = array[i] % max;
        }
    }

    /*
    ==================================================================================================
     */

    public void reverse_array_approach(int[] nums, int k){
        int n = nums.length;
        k = k % n;

        reverse(nums , 0 , n-1);
        reverse(nums , 0 , k-1);
        reverse(nums , k , n-1);
    }

    private void reverse(int[] nums , int start , int end) {
        int temp;
        while(start < end)
        {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
