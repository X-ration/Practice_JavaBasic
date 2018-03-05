//package com.adam.recursive;
//
//import javafx.scene.effect.SepiaTone;
//
//import javax.swing.*;
//import java.util.*;
//
///**
// * @author adam
// * 创建于 2018-03-05 20:15.
// * 用于解决全排列问题的主类,BFS。
// */
//public class FullPermutationBfs {
//
//    private class Node {
//        private int value;
//        private int prevIndex;
//    }
//
//    private int maxNum;
//    private Node[] queue;
//    private int[] levelOffset;
//
//    public FullPermutationBfs(int maxNum) throws Exception{
//        this.maxNum = maxNum;
//        queue = new Node[getQueueLength()];
//        levelOffset = new int[maxNum+1];
//        for(int level = 0; level<=maxNum; level++) {
//            if(level == 0) {
//                levelOffset[level] = 0;
//            } else {
//                levelOffset[level] = levelOffset[level - 1] + factorial(maxNum) / factorial(maxNum - level);  //level1=n!/(n-1)!
//            }
//        }
//        System.out.println("Level Offset:" + Arrays.toString(levelOffset));
//    }
//
//    public void bfs() {
//        for(int level = 1; level <= maxNum; level++) {
//            for(Node node:getPreviousLevelElements(level-1)){
//                Set<Integer> candidates = getRangeSet(maxNum);
//                candidates.remove(node.value);
//                candidates.removeAll(getPreviousElements(node));
//                for(int i = )
//            }
//        }
//    }
//
//    private Set<Integer> getRangeSet(int maxValue) {
//        Set<Integer> set = new HashSet<>();
//        for(int i=1;i<=maxValue;i++) {
//            set.add(i);
//        }
//        return set;
//    }
//
//    private Set<Integer> getPreviousElements(Node node) {
//        Set<Integer> set = new HashSet<>();
//        getPreviousElements(node,set);
//        return set;
//    }
//
//    private void getPreviousElements(Node node, Set<Integer> set) {
//        if(node.prevIndex == -1)
//            return;
//        else{
//            set.add(queue[node.prevIndex].value);
//            getPreviousElements(queue[node.prevIndex],set);
//        }
//    }
//
//    private Node[] getPreviousLevelElements(int currentLevel) {
//        if(currentLevel == 0) {
//            return null;
//        } else {
//            return getChildArray(queue,levelOffset[currentLevel-1],levelOffset[currentLevel]);
//        }
//    }
//
//    private Node[] getChildArray(Node[] array, int startIndex, int endIndex) {
//        //执行左闭右开
//        Node[] res = new Node[endIndex-startIndex];
//        for(int i=startIndex;i<endIndex;i++) {
//            res[i-startIndex] = array[i];
//        }
//        return res;
//    }
//
//    private Set<Node> arrayToSet(Node[] array) {
//        return new HashSet<>(Arrays.asList(array));
//    }
//
//    private int factorial(int max) throws Exception {
//        if(max < 0) {
//            throw new Exception("Bad parameter");
//        } else if (max == 0) {
//            return 1;
//        } else {
//            return max * factorial(max - 1);
//        }
//    }
//
//    private int getQueueLength() throws Exception{
//        int prevRes = factorial(maxNum);
//        int res = 0;
//        for(int j=1;j<=maxNum;j++){
//            res += prevRes / factorial(maxNum - j);
//        }
//        return res;
//    }
//
//}
