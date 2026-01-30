import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @org.junit.jupiter.api.Test
    void push() {
        Stack s = new Stack();
        s.push(6);
        assertEquals(6, s.peek());
        s.pop();
        s.push(7);
        assertEquals(7, s.peek());
    }
    @org.junit.jupiter.api.Test
    void pop() {
        Stack s = new Stack();
        s.push(6);
        assertEquals(6, s.pop());

    }
    @org.junit.jupiter.api.Test
    void peek() {
        Stack s = new Stack();
        s.push(7);
        assertEquals(7, s.peek());
    }
    @org.junit.jupiter.api.Test
    void size() {
        Stack s = new Stack();
        s.push(6);
        s.push(7);
        assertEquals(2, s.size());
    }
    @org.junit.jupiter.api.Test
    void isEmpty() {
        Stack s = new Stack();
        assertTrue(s.isEmpty());
        s.push(6);
        assertFalse(s.isEmpty());
    }
}