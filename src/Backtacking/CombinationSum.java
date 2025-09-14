package Backtacking;

import java.util.ArrayList;

public class CombinationSum {
    public static void main(String[] args) {
        int[][] candidates = {{2,3,6,7},{2,3,5},{2}};
        int[] target= {7,8,1};
        int i=0;
        for(int[] candidate: candidates) {
            ArrayList<ArrayList<Integer>> res = combinationSum(candidate, target[i++]);
            System.out.println(res);
        }
    }

    public static ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> possible = new ArrayList<>();
        combination(candidates, 0, res, possible, target, 0);
        return res;
    }

    public static void combination(int[] candidates, int index,
                                   ArrayList<ArrayList<Integer>> res,
                                   ArrayList<Integer> possible,
                                   int target, int sum) {
        if (sum == target) {
            res.add(new ArrayList<>(possible));
            return;
        }
        if (sum > target || index == candidates.length) {
            return;
        }
        possible.add(candidates[index]);
        combination(candidates, index, res, possible, target, sum + candidates[index]);
        possible.remove(possible.size() - 1);
        combination(candidates, index + 1, res, possible, target, sum);
    }
}
