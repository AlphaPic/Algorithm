package com.simple;

/**
 * @Author alan
 * @Date 2018/11/25
 */
public class FirstOccursStr {
	public int strStr(String haystack, String needle) {
		if (needle == null || needle.length() == 0){
			return 0;
		}

		if (haystack == null || haystack.length() == 0 || needle.length() > haystack.length()){
			return -1;
		}

		int nlen = needle.length();
		int hlen = haystack.length();
		int start = 0;
		while (start + nlen <= hlen){
			int i = start;
			int n = 0;
			for (;i < start + nlen;i++){
				if (needle.charAt(n) != haystack.charAt(i)){
					break;
				}
				n++;
			}
			if (n == nlen){
				return start;
			}
			start++;
		}
		return -1;
	}

	public static void main(String[] args) {
		String[][] values = {
//			{"qwetqyequyqyeoyoqyweyqeyoquoq","ewr"},
//			{"qweqkjcbmbcahvsdjbcajdshbkas","bmb"},
//			{"qeqeqweyqyqeyoqwuoe",""},
//			{"oqweqeyqbbcnnasfdghhfbhhgvavfsdfa","nas"},
//			{"qweuqiewqyei","mnbvb"},
//			{"eqweqeq","mkihb"}
			{"mississippi","a"}
		};

		FirstOccursStr f = new FirstOccursStr();

		for (String[] value : values){
			System.out.println("haystack = " + value[0] + ",needle = " + value[1] + ",res = " + f.strStr(value[0],value[1]));
		}
	}
}
