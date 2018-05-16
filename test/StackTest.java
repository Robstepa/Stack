import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void testCreateInstance(){
        Stack stack = new Stack();
    }

    @Test
    void testCreateInstanceWithParameter(){
        Stack stack = new Stack(15);
    }

    @Test
    void testPushAndPeek(){
        Stack<String> stack = new Stack<>();
        String a = "a";
        stack.push(a);
        assertEquals("a", stack.peek());
    }

    @Test
    void testPop(){
        Stack<String> stack = new Stack<>();
        String a = "a";
        String b = "b";
        stack.push(a);
        stack.push(b);
        assertEquals("b", stack.pop());
        assertEquals("a", stack.pop());
    }

    @Test
    void testPushToFullStack(){
        Stack<String> stack = new Stack<>(2);
        String a = "a";
        String b = "b";
        String c = "c";
        stack.push(a);
        stack.push(b);
        assertThrows(CustomStackException.class, ()->stack.push(c));
    }

    @Test
    void testPeekFromEmptyStack(){
        Stack<String> stack = new Stack<>();
        assertThrows(CustomStackException.class, ()-> stack.peek());
    }

    @Test
    void testPopFromEmptyStack(){
        Stack<String> stack = new Stack<>();
        assertThrows(CustomStackException.class, ()-> stack.pop());
    }

    @Test
    void testCreateInstanceWithNegativeSize(){
        assertThrows(NegativeArraySizeException.class, ()-> new Stack<>(-2));
    }

    @Test
    void testContains(){
        Stack<String> stack = new Stack<>();
        String a = "a";
        String b = "b";
        stack.push(a);
        stack.push(b);
        assertTrue(stack.contains("a"));
    }
}