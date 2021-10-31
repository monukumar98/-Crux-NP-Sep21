package Lec14;

public class Cb_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "457345";
		// Integer.parseInt(str); String to int
		int count = 0;
		boolean[] visited = new boolean[str.length()];
		for (int len = 1; len <= str.length(); len++) {
			for (int si = 0; si <= str.length() - len; si++) {
				int ei = si + len;
				String s = str.substring(si, ei);
				
				if (is_visited(visited, si, ei - 1) && Is_CbNumber(Long.parseLong(s))) {
					count++;
				
					for (int i = si; i <ei; i++) {
						visited[i]=true;
					}
				}

			}

		}
		System.out.println(count);

	}

	public static boolean is_visited(boolean [] visited, int si, int ei) {
		for (int i = si; i <=ei; i++) {
			if(visited[i]) {
				return false;
			}
			
		}
		return true;
	}

	public static boolean Is_CbNumber(long n) {
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (n%arr[i] == 0) {
				return false;
			}
		}
		return true;

	}

}
