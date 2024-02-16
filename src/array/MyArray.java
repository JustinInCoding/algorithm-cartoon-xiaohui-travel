package array;

public class MyArray {
    // 中间插入
    private int[] array;
    private int size;

    public MyArray(int capacity) {
        this.array = new int[capacity];
        size = 0;
    }

    /**
     * 数组插入元素
     * @param index 插入的位置
     * @param element 插入的元素
     */
    public void insert(int index, int element) {
        // 判断访问下标是否超出范围
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出数组实际元素范围！");
        }
        // 如果实际元素达到数组容量上限，则对数组进行扩容
        if (size >= array.length) {
            resize();
        }
        // 从右往左循环，将元素逐个向右娜 1 位
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        // 腾出的位置放入新元素
        array[index] = element;
        size++;
    }

    /**
     * 数组扩容
     */
    public void resize() {
        int[] arrayNew = new int[array.length * 2];
        // 从旧数组复制到新数组
        System.arraycopy(array, 0, arrayNew, 0, array.length);
        array = arrayNew;
    }

    /**
     * 输出数组
     */
    public void output() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * 数组删除元素
     * @param index 数组下标
     * @return 删除的元素值
     * @throws Exception 数组越界
     */
    public int delete(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("超出数组实际元素范围！");
        }
        int deletedElement = array[index];
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return deletedElement;
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray(4);
        myArray.insert(0, 3);
        myArray.insert(1, 7);
        myArray.insert(2, 9);
        myArray.insert(3, 5);
        myArray.insert(1, 6);
        myArray.output();
    }

}
