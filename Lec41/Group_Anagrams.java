package Lec41;

import java.util.*;

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(arr));

	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			String s = strs[i];
			int freq[] = new int[26];
			for (int j = 0; j < s.length(); j++) {
				char ch = s.charAt(j);
				freq[ch - 'a'] = freq[ch - 'a'] + 1;
			}
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < freq.length; j++) {
				sb.append(freq[j] + " ");
			}
			String ss = sb.toString();
			if (!map.containsKey(ss)) {
				map.put(ss, new ArrayList<>());
			}
			map.get(ss).add(s);

		}
		List<List<String >> ll = new ArrayList<>();
		for(String key:map.keySet()) {
			ll.add(map.get(key));
		}
		return ll;

	}

}
