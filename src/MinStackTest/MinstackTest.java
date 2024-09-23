package MinStackTest;

import static org.junit.jupiter.api.Assertions.*;

import Source.MinStack;
import org.junit.jupiter.api.Test;

class MinStackTest {

    @Test
    public void testCase1() {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);
        assertEquals(1, minStack.min()); // Expected Output: 1
    }

    @Test
    public void testCase2() {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);
        minStack.pop(); // Removes 1
        assertEquals(2, minStack.min()); // Expected Output: 2
    }

    @Test
    public void testCase3() {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);
        assertEquals(1, minStack.min()); // Expected Output: 1
    }
}

