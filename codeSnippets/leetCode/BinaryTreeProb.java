import java.util.*;


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BinaryTreeProb {

    ArrayList<String> numbersList = new ArrayList<>();

    int sum = 0;

    public int sumRootToLeaf(TreeNode root) {

        postOrder(root, numbersList);

        for(String num : numbersList){
            sum = sum + binaryToDigit(num);
        }

        return sum;
    }

    private void postOrder(TreeNode root, ArrayList<String> numbersList){

        if(root == null)
            return;

        postOrder(root.left, numbersList);

        postOrder(root.right, numbersList);

        if(numbersList.size() > 0){
            numbersList.replaceAll(num -> Integer.toString(root.val) + num);
        }
        else
            numbersList.add(Integer.toString(root.val));

    }

    private Integer binaryToDigit(String val){

        return Integer.parseInt(val,2);

    }

}