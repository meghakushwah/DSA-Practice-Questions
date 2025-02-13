class Solution {
    boolean findTarget(Node root, int target) {
        // Write your code here
        Map<Integer, Integer> store = new HashMap<>();
        return traversal(root, target, store);
    }
    static boolean traversal(Node node, int target, Map<Integer, Integer> map) {
        if(node == null) {
            return false;
        }
        if(map.get(target - node.data) != null) {
            return true;
        } else {
            map.put(node.data, 1);
        }
        if(traversal(node.left, target, map)) {
            return true;
        }
        return traversal(node.right, target, map);
    }
}
