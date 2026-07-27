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
class Solution {
    public List<TreeNode> generateTrees(int n) {
        return gensub(1,n);
    }

    private List<TreeNode> gensub(int s,int e){
        List<TreeNode> re = new LinkedList<TreeNode>();
        if(s>e){
            re.add(null);
            return re;
        }


        for(int i=s;i<=e;++i){
            List<TreeNode> ls = gensub(s,i-1);
            List<TreeNode> rs = gensub(i+1,e);

            for(TreeNode l:ls){
                for(TreeNode r:rs){
                    TreeNode root = new TreeNode(i);
                    root.left=l;
                    root.right=r;
                    re.add(root);
                }
            }
        }
        return re;
    }
}