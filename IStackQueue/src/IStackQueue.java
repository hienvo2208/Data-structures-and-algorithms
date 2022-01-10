public interface IStackQueue {
    /**
     * Trả về push có thành công hay không
     */
    public boolean push(int value);

    /**
     * @param
     * @return
     */
    public int pop();

    /**
     * Trước khi pull vào thì kiểm tra có full hay không.
     */
    public boolean isFull();

    /**
     * Kiểm tra có trống hay không.
     */
    public boolean isEmpty();
    public void print();
}
