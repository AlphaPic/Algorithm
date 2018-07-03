package com.simple;

/**
 * @author:fanwenlong
 * @date:2018-07-03 20:01:49
 * @E-mail:alpha18603074401@gmail.com
 * @mobile:186-0307-4401
 * @description:
 * @detail:
 */
public class LengthOfLastDemo {
    /**
     * 获取最后一个单词的长度
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        int start = 0,end = s.length() - 1;
        start = end;
        boolean stick = false;
        for (int i = s.length() - 1;i >= 0 ;i--){
            if (s.charAt(i) == ' ' && stick == false){
                end--;
                start = end;
                continue;
            }
            stick = true;
            if (s.charAt(i) != ' '){
                start--;
                continue;
            }
            break;
        }
        return end - start;
    }

    public static void main(String[] args) {
        String[] strings = {" ",
                            "Hi I am Jackson",
                            " Ho La Laaaa  "};
        LengthOfLastDemo demo = new LengthOfLastDemo();
        for (String str : strings){
            int len = demo.lengthOfLastWord(str);
            System.out.println("\""+ str + "\"的最后一个单词的长度为" + len);
        }
    }
}
