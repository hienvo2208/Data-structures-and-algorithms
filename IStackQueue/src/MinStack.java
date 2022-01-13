public class MinStack {
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node topNode = null;

    public MinStack() {

    }

    public void push(int val) {
        if (!isFull()) {
            Node newNode = new Node(val);
            newNode.next = topNode;
            topNode = newNode;
        }
    }

    public void pop() {
        if (!isEmpty()) {
            topNode = topNode.next;
        }
    }

    public int top() {
        if (!isEmpty()) {
            return topNode.value;
        }
        return -1;

    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        Node temp = topNode;
        while (temp != null) {
            min = Integer.min(min,temp.value);
            temp = temp.next;
        }
        return min;
    }

    public boolean isFull() {
        return false;
    }

    public boolean isEmpty() {
        return topNode == null;
    }


}
