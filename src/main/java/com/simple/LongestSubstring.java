package com.simple;

/**
 * @author:fanwenlong
 * @date:2018-06-25 22:02:55
 * @E-mail:alpha18603074401@gmail.com
 * @mobile:186-0307-4401
 * @description:
 * @detail:
 */
public class LongestSubstring {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }else if(strs.length == 1){
            return strs[0];
        }else {
            String common = strs[0];
            for (int i = 1;i < strs.length;i++){
                common = commonString(common,strs[i]);
            }
            return common;
        }
    }

    /**
     *
     * @param str1
     * @param str2
     * @return
     */
    public String commonString(String str1,String str2){
        if (str1 == null || str2 == null || "".equals(str1) || "".equals(str2)){
            return "";
        }

        int len = str1.length() > str2.length() ? str2.length() : str1.length();

        StringBuilder sb = new StringBuilder(100);
        for (int i = 0;i < len;i++){
            if (str1.charAt(i) == str2.charAt(i)){
                sb.append(str1.charAt(i));
            }else {
                break;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args){
        String[] arr = {"flower","flow","flooooight"};
        System.out.println(new LongestSubstring().longestCommonPrefix(arr));
    }
}
