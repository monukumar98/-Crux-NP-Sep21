package Lec41;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection_of_Two_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 1, 3, 1, 3, 4 };
		int[] arr2 = { 2, 1, 3, 1, 4, 1, 11, 4, 5, 1, 4, 5, 22 };
		arr = intersect(arr, arr2);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums1.length; i++) {
			if (map.containsKey(nums1[i]) == true) {

				map.put(nums1[i], map.get(nums1[i]) + 1);

			} else {
				map.put(nums1[i], 1);
			}

		}
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums2.length; i++) {

			if ((map.containsKey(nums2[i])== true) && map.get(nums2[i]) > 0) {
				list.add(nums2[i]);
				map.put(nums2[i], map.get(nums2[i]) - 1);
			}

		}

		int[] arr = new int[list.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = list.get(i);
		}
		return arr;

	}

}
