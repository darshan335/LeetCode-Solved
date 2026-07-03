package com.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
class Sum {
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int cur = nums[i];
			// x=target-cur cur+x=target
			int x = target - cur;
			if (map.containsKey(x)) {
				return new int[] { map.get(x),i };
			}
			map.put(cur, i);
		}
		return null;
	}
}

public class TwoSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = scan.nextInt();
		int[] nums = new int[size];
		System.out.print("Enter "+size+" Elements : ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		System.out.print("Enter Target : ");
		int target = scan.nextInt();
		int[] res = Sum.twoSum(nums, target);
		System.out.println(Arrays.toString(res));

	}

}
