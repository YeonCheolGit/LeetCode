/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Point{
    Node node;
    int depth;
    public Point(Node node, int depth){
        this.node=node;
        this.depth=depth;
    }
}

class Solution {
    
    int ans=0;
    public int maxDepth(Node root) {
        if(root==null) return 0;
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(root,1));
        while(!queue.isEmpty()){
            Point point = queue.poll();
            int depth = point.depth;
            if(depth>ans) ans=depth;
            for(int i=0;i<point.node.children.size();i++){
                Node childrenNode = point.node.children.get(i);
                queue.add(new Point(childrenNode,depth+1));
            }
        }
        return ans;
    }
}