package com.adam.recursive;

/**
 * @author adam
 * 创建于 2018-03-05 19:36.
 * 输入一个数n，输出1～n的全排列。
 */
public class FullPermutationMain {

    public static void main(String[] args) throws Exception {
        FullPermutationDfs fullPermutation = new FullPermutationDfs(3);
        fullPermutation.dfs(0);
        //FullPermutationBfs fullPermutationBfs = new FullPermutationBfs(3);
    }

}
