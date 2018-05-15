import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void testAdd() {
        Queue<String> queue = new Queue<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        queue.add("e");
        queue.add("f");
        queue.add("asd");
        queue.add("f");
        queue.showAll();
        assertEquals("f", queue.get());
    }

    @Test
    void testGet() {
        Queue<String> queue = new Queue<>();
        queue.add("a");
        queue.add("b");
        assertEquals("b", queue.get());
    }
}