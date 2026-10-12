/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        
        Map<Node,Node> map = new HashMap<Node, Node>();
        
        Node newHead = new Node(head.val);
        Node oldN = head.next;
        Node newN = newHead;
        map.put(head, newHead);
        while(oldN != null) {
        	Node copy = new Node(oldN.val);
        	map.put(oldN, copy);
        	newN.next = copy;
        	
        	oldN  = oldN.next;
        	newN = newN.next;
        }
        
        oldN = head; newN = newHead;
        while(oldN != null) {
        	newN.random = map.get(oldN.random);
        	oldN  = oldN.next;
        	newN = newN.next;
        }
        
        return newHead;
    }
}
