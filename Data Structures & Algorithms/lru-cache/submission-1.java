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
    	    	
    	    	Node res = map.get(key);
    	    	if(res == null) return -1;
    	    	deleteNode(res);
    	    	addNode(res);
    	    	return res.val;
    	    }
    	    
    	    

			public void put(int key, int value) {
				
				if(limit==0) return;
			
    	    	if(map.containsKey(key)) {
    	    		Node old = map.get(key);
    	    		old.val = value;
    	    		deleteNode(old);
    	    		addNode(old);
    	    		 return;
    	    	}
    	    	if(map.size() == limit) {
    	    		Node lruNode = tail.prev;
    	    		map.remove(lruNode.key);
    	    		deleteNode(lruNode);
    	    	}
    	    	
    	    	
    	    	Node newNode = new Node(key,value);
    	    	map.put(key, newNode);
    	    	addNode(newNode);
    	    }
			private void addNode(Node node) {
			 Node temp = head.next;
			 head.next = node;
			 node.prev = head;
			 node.next = temp;
			 temp.prev = node;	
			}

			private void deleteNode(Node node) {
				Node oldPrev = node.prev;
				Node oldNext = node.next;
				oldPrev.next= oldNext;
				oldNext.prev = oldPrev;
			}

			
    	}
