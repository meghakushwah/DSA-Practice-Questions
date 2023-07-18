class LRUCache {

    private final int capacity;
    private final Map<Integer, Node> map;
    private final DoublyLinkedList doublyLinkedList;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        doublyLinkedList = new DoublyLinkedList();
    }

   
    public int get(int key) {
        Node node = map.get(key);
        if (node == null) return -1;
        doublyLinkedList.moveToHead(node);
        return node.value;
    }


    public void put(int key, int value) {
        Node node = map.get(key);
        if (node != null) {
            node.value = value;
            doublyLinkedList.moveToHead(node);
        }
        else {
            if (map.size() == capacity) {
                Node last = doublyLinkedList.getLast(); // LRU element
                doublyLinkedList.removeNode(last);
                map.remove(last.key);
            }
            node = new Node(key, value);
            doublyLinkedList.addNode(node);
            map.put(key, node);
        }
    }
}

class DoublyLinkedList {
    Node head, tail;

    void addNode(Node node) {
        if (head == null) head = tail = node;
        else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    void removeNode(Node node) {
        if (node == head && node == tail) head = tail = null;
        else if (node == head) head = head.next;
        else if (node == tail) tail = tail.prev;
        else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        node.next = node.prev = null;
    }

    void moveToHead(Node node) {
        removeNode(node);
        addNode(node);
    }

    Node getLast() {
        return tail;
    }
}

class Node {
    int key;
    int value;
    Node next;
    Node prev;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
