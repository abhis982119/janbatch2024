package org.pbatch.coding;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,3,5};
        int[] nums2 = new int[]{2,3,6};

        int[] result = new int[nums1.length +  nums2.length];

        int i = 0,j = 0,k = 0 ;

        while(i < nums1.length && j < nums2.length ){
            if(nums1[i] < nums2[j])  result[k++] = nums1[i++];
            else result[k++] = nums2[j++];
        }

        // adding leftover values in nums1
        while(i < nums1.length)  result[k++] = nums1[i++];

        //adding leftover values of nums2
        while(j < nums2.length)  result[k++] = nums2[j++];

        print(result);
    }

    public static void print(int[] arr){
        for(int value : arr){
            System.out.print(value +", ");
        }
    }
}
