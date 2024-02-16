package array;

public class ArrayOperation {
    public static void main(String[] args) {
//        readElement();
//        updateElement();
    }

    // 读取元素
    public static void readElement() {
        int [] array = new int[] { 3, 1, 2, 5, 4, 9, 7, 2 };
        // 输出数组中下标为 3 的元素
        System.out.println(array[3]);
    }

    // 更新元素
    public static void updateElement() {
        int [] array = new int[] { 3, 1, 2, 5, 4, 9, 7, 2 };
        // 给数组下标为 5 的元素赋值
        array[5] = 10;
        // 输出数组中下标为 5 的元素
        System.out.println(array[5]);
    }

 }
