package hackerrank;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;
//
//This is a demo task.
//
//        Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//        Given A = [1, 2, 3], the function should return 4.
//
//        Given A = [−1, −3], the function should return 1.
//
//        Write an efficient algorithm for the following assumptions:
//
//        N is an integer within the range [1..100,000];
//        each element of array A is an integer within the range [−1,000,000..1,000,000].
//        Copyright 2009–2019 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.


public class iInterviewTask {
//
//@Test
//        public int solution(int[] A) {
//
//            int N = A.length;
//            Set<Integer> set = new HashSet<>();
//            for (int a : A) {
//                if (a > 0) {
//                    set.add(a);
//                }
//            }
//            for (int i = 1; i <= N + 1; i++) {
//                if (!set.contains(i)) {
//                    return i;
//                }
//            }
//        }
            // write your code in Java SE 8
//
//    public static int sol(int[] A)
//    {
//        boolean flag =false;
//        for(int i=1; i<=1000000;i++ ) {
//            for(int j=0;j<A.length;j++) {
//                if(A[j]==i) {
//                    flag = false;
//                    break;
//                }else {
//                    flag = true;
//                }
//            }
//            if(flag) {
//                return i;
//            }
//        }
//        return 1;
//    }
//    }


    static int segregate(int arr[], int size)
    {
        int j = 0, i;
        for (i = 0; i < size; i++) {
            if (arr[i] <= 0) {
                int temp;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                // increment count of non-positive
                // integers
                j++;
            }
        }

        return j;
    }

    /* Find the smallest positive missing
       number in an array that contains
       all positive integers */
    static int findMissingPositive(int arr[], int size)
    {
        int i;

        // Mark arr[i] as visited by making
        // arr[arr[i] - 1] negative. Note that
        // 1 is subtracted because index start
        // from 0 and positive numbers start from 1
        for (i = 0; i < size; i++) {
            int x = Math.abs(arr[i]);
            if (x - 1 < size && arr[x - 1] > 0)
                arr[x - 1] = -arr[x - 1];

        }

        // Return the first index value at which
        // is positive
        for (i = 0; i < size; i++)
            if (arr[i] > 0)
                return i + 1; // 1 is added becuase indexes
        // start from 0

        return size + 1;
    }

//    public static int sol(int[] A)
//    {
//        boolean flag =false;
//        for(int i=1; i<=1000000;i++ ) {
//            for(int j=0;j<A.length;j++) {
//                if(A[j]==i) {
//                    flag = false;
//                    break;
//                }else {
//                    flag = true;
//                }
//            }
//            if(flag) {
//                return i;
//            }
//        }
//        return 1;
//    }

    static int findMissing(int arr[], int size)
    {

        int shift = segregate(arr, size);
        int arr2[] = new int[size - shift];
        int j = 0;
        for (int i = shift; i < size; i++) {
            arr2[j] = arr[i];
            j++;
        }

        return findMissingPositive(arr2, j);
    }

    public static void main(String[] args)
    {
        int arr[] = { 0, 10, 1, 2, -10, -20 };
        int arr_size = arr.length;
        int missing = findMissing(arr, arr_size);
        System.out.println("The smallest positive missing number is " + missing);
    }
}