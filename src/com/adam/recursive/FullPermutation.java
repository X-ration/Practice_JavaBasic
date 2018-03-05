package com.adam.recursive;

import java.util.Arrays;

/**
 * @author adam
 * 创建于 2018-03-05 19:38.
 * 用于解决全排列问题的主类。
 */
public class FullPermutation {

    private final int maxNum;
    private int[] permutation;
    private int[] book;

    public FullPermutation(int maxNum) {
        this.maxNum = maxNum;
        this.permutation = new int[maxNum];
        this.book = new int[maxNum];
    }

    public void dfs(int step) {
        //输出一种排列，递归出口
        if(step == maxNum) {
            System.out.println(Arrays.toString(permutation));
            return;
        }

        //依次尝试每一张牌
        for(int i = 0; i < maxNum ; i++) {
            if(book[i]==0) {
                book[i] = 1;  //标记第i个数用过了
                permutation[step] = i+1; //i:1~maxNum
                dfs(step+1);  //处理下一步
                book[i] = 0;  //标记第i个数用完了
            }
        }
    }

}
