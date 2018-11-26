package com.common;

/**
 * @Author alan
 * @Date 2018/11/25
 */
public class FindLongestPalindrome {
	private boolean textIsPalindrome(char[] values,int start,int end){
		if (values == null || values.length <= 1){
			return true;
		}
		int high = end - 1;
		int low = start;
		while (high > low){
			if (values[high] != values[low]){
				return false;
			}
			high--;
			low++;
		}
		return true;
	}

	private String getSubStringPalindrome(String s,int len){
		if (s == null || s.length() <= 1){
			return s;
		}
		char[] values = s.toCharArray();
		int start = 0;
		int end = len;
		int length = s.length();
		while (end <= length){
			if (textIsPalindrome(values,start,end)){
				return s.substring(start,end);
			}
			start++;
			end++;
		}
		return null;
	}

	private String longestPalindrome(String s){
		if (s == null || s.length() <= 1){
			return s;
		}
		int length = s.length();
		while (length > 1){
			String value = getSubStringPalindrome(s,length);
			if (value != null){
				return value;
			}
			length--;
		}
		return s.substring(0,1);
	}

	public static void main(String[] args) {
		String[] words = {
			"akjhsdljahdahs",
			"qweyqqyeq",
			"asdfghgfdsa",
			"qweertksdgfhsgdfgyweyroqqyipqpeyqowiryuoqheuiwyteriuoquweyqworqpyoqwyyroqworyquqwrtotqwrtoq",
			"qweqwyeey",
			"oiuhnfghdbgdgsffywgtftyrhtgdfgfbfsgtvfgtrbgbasdfghjklkjhgfdsaqwetqteoi",
			"hgtfdgfertfsfv",
			"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
			"lphbehiapswjudnbcossedgioawodnwdruaaxhbkwrxyzaxygmnjgwysafuqbmtzwdkihbwkrjefrsgjbrycembzzlwhxneiijgzidhngbmxwkhphoctpilgooitqbpjxhwrekiqupmlcvawaiposqttsdgzcsjqrmlgyvkkipfigttahljdhtksrozehkzgshekeaxezrswvtinyouomqybqsrtegwwqhqivgnyehpzrhgzckpnnpvajqevbzeksvbezoqygjtdouecnhpjibmsgmcqcgxwzlzztdneahixxhwwuehfsiqghgeunpxgvavqbqrelnvhnnyqnjqfysfltclzeoaletjfzskzvcdwhlbmwbdkxnyqappjzwlowslwcbbmcxoiqkjaqqwvkybimebapkorhfdzntodhpbhgmsspgkbetmgkqlolsltpulgsmyapgjeswazvhxedqsypejwuzlvegtusjcsoenrcmypexkjxyduohlvkhwbrtzjnarusbouwamazzejhnetfqbidalfomecehfmzqkhndpkxinzkpxvhwargbwvaeqbzdhxzmmeeozxxtzpylohvdwoqocvutcelgdsnmubyeeeufdaoznxpvdiwnkjliqtgcmvhilndcdelpnilszzerdcuokyhcxjuedjielvngarsgxkemvhlzuprywlypxeezaxoqfges",
			"asdfgfdsa",
			"",
			"qwerrtqweqeq",
			"qwertytrewq"
		};

		FindLongestPalindrome f = new FindLongestPalindrome();

		for (String word : words){
//			System.out.println(word + " : " + f.textIsPalindrome(word.toCharArray(),0,word.length()));
			System.out.println(word + " : " + f.longestPalindrome(word));
		}
	}
}
