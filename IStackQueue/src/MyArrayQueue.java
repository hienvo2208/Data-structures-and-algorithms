public class MyArrayQueue implements IStackQueue {
    private int[] array;
    private int SIZE;
    private int headIndex;
    private int tailIndex;

    MyArrayQueue(int size) {
        this.SIZE = size;
        this.array = new int[SIZE];
        headIndex = tailIndex = -1;

    }

    public int count() {
        if (!isEmpty()) {
            return tailIndex - headIndex + 1;
        }
        return 0;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            if (isEmpty()) {
                headIndex++;
            }
            tailIndex++;
            array[tailIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value = -1;
        if (!isEmpty()) {
            value = array[headIndex];
            headIndex++;
            if (headIndex > tailIndex) {
                headIndex = tailIndex = -1;
            }
        }
        return value;
    }

    @Override
    public boolean isFull() {
        return tailIndex == SIZE - 1;
    }

    @Override
    public boolean isEmpty() {
        return (headIndex == -1 && tailIndex == -1);
    }

    @Override
    public void print() {
        if (!isEmpty()) {
            for (int i = headIndex; i <= tailIndex; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
