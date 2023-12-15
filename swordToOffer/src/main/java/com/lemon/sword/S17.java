package com.lemon.sword;

/**
 * Created by lemoon on 2023/5/20 06:17
 */
public class S17 {
    public int[] printNumbers(int n) {
        if(n<=0){
            return new int[0];
        }

        return null;

//        String[] strs = new String[(int)(Math.pow(10,n)-1)];


    }

    public static void main(String[] args) {
        System.out.println(new S17().convertToNoneZero("103", 3));

    }

    public int convertToNoneZero(String str,int n ){
        if(str == null || str.length()!=n){
            throw new RuntimeException();
        }

        boolean isStartZero = true;
        int result = 0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) != '0'){
                isStartZero = false;
            }
            if(!isStartZero){
                result = result*10 + str.charAt(i)-'0';
            }
        }
        return result;

    }
}
