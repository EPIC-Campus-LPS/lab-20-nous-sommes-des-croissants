import java.util.NoSuchElementException;

public class Queue {

    private int[] nums;
    public Queue() {
        nums = new int[0];
    }
    /**
     * adds element to the start of the queue
     * runtime: O(N)
     * @param element
     */
    public void add(int element) {
        int[] tempArrary = new int[nums.length + 1];
        tempArrary[0] = element;
        for (int i = 1; i < nums.length; i++) {
            tempArrary[i] = nums [i];
        }
        nums = tempArrary;
    }

    /**
     * removes the element at the end of the queue and returns it
     * runtime: O(N)
     * @return element that was removed
     */
    public int remove() {
        if (nums.length == 0) {
            throw new NoSuchElementException();
        }
        int ret = nums[nums.length -1];
        int[] tempArrary = new int[nums.length - 1];
        for (int i = 0; i < tempArrary.length; i++) {
           tempArrary[i] =  nums[i];
        }
        nums = tempArrary;
        return ret;
    }

    /**
     * looks at the end of the queue
     * Runtime: O(1)
     * @return the element at the end of the queue
     */
    public int peek() {
        return nums[nums.length - 1];
    }

    /**
     * finds the length of the queue
     * Runtime: O(1)
     * @return the length of the queue
     */
    public int size() {
        return nums.length;
    }

    /**
     * checks to see if the queue is empty
     * Runtime: O(1)
     * @return true is empty and false if not
     */
    public boolean isEmpty() {
        if (nums.length == 0) {
            return true;
        }
        return false;
    }

}
