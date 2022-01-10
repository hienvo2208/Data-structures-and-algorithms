public class MyLinkedListQueue implements IStackQueue {

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            Node newNode = new Node(value);
            if (isEmpty()) {
                headNode = tailNode = newNode;
            } else {
                tailNode.next = newNode;
                tailNode = newNode;
            }
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int value = headNode.value;
        if (headNode == tailNode) {
            headNode = tailNode = null;
        } else {
            headNode = headNode.next;
        }
        return value;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return (headNode == null && tailNode == null);
    }

    @Override
    public void print() {
        if(isEmpty()){
            System.out.println("Is empty");
        }
       Node temp = headNode;
       while(temp != null){
           System.out.print(temp.value+" ");
           temp = temp.next;
       }
        System.out.println();
    }

    public class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    Node headNode, tailNode;

    // Ham tao
    MyLinkedListQueue() {
        headNode = tailNode = null;
    }
}
