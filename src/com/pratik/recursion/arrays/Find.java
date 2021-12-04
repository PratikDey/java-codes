package com.pratik.recursion.arrays;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 8, 8, 12};
        int target = 8;
        System.out.println(findIndexInList2(arr, target, 0));
    }

    static boolean find(int[] arr, int target, int index) {
        if(index == arr.length) {
            return false;
        }

        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if(index == arr.length) {
            return -1;
        }
        if(arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }

    }

    static ArrayList<Integer> findIndexInList(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length) {
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        return findIndexInList(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findIndexInList2(int[] arr, int target, int index) {
        ArrayList<Integer> list =  new ArrayList<Integer>();

        if(index == arr.length) {
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findIndexInList2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
