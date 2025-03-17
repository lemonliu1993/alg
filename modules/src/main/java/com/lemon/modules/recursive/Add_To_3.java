package com.lemon.modules.recursive;

/**
 * Created by lemoon on 2025/3/16 11:23
 */
public class Add_To_3 {

    static Integer computeSum(int i,Integer res){
        if(i >3){
            return res;
        }
        res += i;
        return computeSum(i+1,res);
    }

    public static void main(String[] args) {
        Integer res = 0;
        res = computeSum(1,res);
        System.out.println(res);
    }
}
