import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @org.junit.jupiter.api.Test
    void add() {
        Queue q = new Queue();
        q.add(7);
        assertEquals(7, q.peek());
        q.remove();
        q.add(9);
        assertEquals(9, q.peek());
    }

    @org.junit.jupiter.api.Test
    void remove() {
        Queue q = new Queue();
        q.add(7);
        assertEquals(7, q.remove());
        q.add(9);
        assertEquals(9, q.remove());
    }

    @org.junit.jupiter.api.Test
    void peek() {
        Queue q = new Queue();
        q.add(7);
        assertEquals(7, q.peek());
    }

    @org.junit.jupiter.api.Test
    void size() {
        Queue q = new Queue();
        q.add(7);
        q.add(9);
        assertEquals(2, q.size());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        Queue q = new Queue();
        assertTrue(q.isEmpty());
        q.add(7);
        assertFalse(q.isEmpty());
    }
}