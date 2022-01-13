import java.util.ArrayList;
import java.util.List;

public class MyLinkedListStack implements IStackQueue {
    @Override

    /**
     * Them mot phan tu vao dau link list
     */
    public boolean push(int value) {
        if (!isFull()) {
            Node newNode = new Node(value);
            if (topNode == null) {
                topNode = newNode;
            } else {
                newNode.next = topNode;
                topNode = newNode;
            }
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            int value = topNode.value;
            topNode = topNode.next;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void print() {
        List<Integer> list = new ArrayList<>();
        Node temp = topNode;
        while (temp != null) {
            list.add(temp.value);
            temp = temp.next;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    private class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    Node topNode;

    MyLinkedListStack() {
        topNode = null;
    }
}
