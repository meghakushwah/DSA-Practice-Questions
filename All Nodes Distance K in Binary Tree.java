class Solution {
    
    public void markParents(TreeNode root,Map<TreeNode,TreeNode> parent_track,TreeNode target){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            if(cur.left != null){
                parent_track.put(cur.left,cur);
                q.offer(cur.left);
            }
            if(cur.right != null){
                parent_track.put(cur.right,cur);
                q.offer(cur.right);
            }
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> parent_track = new HashMap<>();
        markParents(root,parent_track,root);
        Map<TreeNode,Boolean> visited = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(target);
        visited.put(target,true);

        int cur_level = 0;
        while(!q.isEmpty()){
            int size = q.size();
            if(k == cur_level){
                break;
            }
            cur_level++;
            for(int i = 0; i < size; i++){
                TreeNode current = q.poll();
                if(current.left != null && visited.get(current.left) == null){
                    q.offer(current.left);
                    visited.put(current.left,true);
                }
                if(current.right != null && visited.get(current.right) == null){
                    q.offer(current.right);
                    visited.put(current.right,true);
                }
                if(parent_track.get(current) != null && visited.get(parent_track.get(current)) == null){
                    q.offer(parent_track.get(current));
                    visited.put(parent_track.get(current),true);
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode current = q.poll();
            result.add(current.val);
        }
    return result;
    }
}
