class LRUCache {
    class Node {
				int key , val;
				Node prev;
				Node next;
				
				Node(int k , int v){
					key=k;
					val = v;
					next = prev = null;
				}
	}
            Node head = new Node(-1,-1);
			Node tail = new Node(-1,-1);
			
			Map<Integer,Node> map = new HashMap<>();
			int limit;
    public LRUCache(int capacity) {
        limit = capacity;
    	    	head.next = tail;
    	    	tail.prev = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
    	    	Node res = map.get(key);
    	    	map.remove(key);
    	    	deleteNode(res);
    	    	addNode(res);
    	    	map.put(key, res);
    	        return res.val;
    }
    
    public void put(int key, int value) {
                if(map.containsKey(key)) {
    	    		Node oldNode = map.get(key);
    	    		deleteNode(oldNode);
    	    		map.remove(key);
    	    	}
    	    	
    	    	//if capacity is reached 
    	    	if (limit == 0) return;

                if (map.size() == limit) {
                    Node lru = tail.prev;
                    map.remove(lru.key);
                    deleteNode(lru);
                }
    	    	
    	    
    	        Node newNode = new Node(key,value);
    	        addNode(newNode);
    	        map.put(key, newNode);
    }
    private void deleteNode(Node oldNode) {
				// TODO Auto-generated method stub
				Node oldPrev = oldNode.prev;
				Node oldNext = oldNode.next;
				oldPrev.next = oldNext;
				oldNext.prev=oldPrev;
			}

			private void addNode(Node newNode) {
				// to add new node in next of head
				Node oldNode = head.next;
				head.next = newNode;
				newNode.next=oldNode;
				newNode.prev = head;
                oldNode.prev = newNode;
			}
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */