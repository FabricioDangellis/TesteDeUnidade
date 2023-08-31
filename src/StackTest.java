import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class StackTest {

    Stack<Integer> stack;

    @Before
    public void init() {
        //Inicializa a pilha
        stack = new Stack<Integer>();
    }

    @Test
    public void testEmptyStack() {
        //Testa se está vazia
        //stack.push(10);
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testNotEmptyStack() {
        //Testa de a pilha não está vazia
        stack.push(10);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testSizeStack() {
        //Testa o tamanho da pilha
        stack.push(10);
        stack.push(20);
        stack.push(30);
        int size = stack.size();
        assertEquals(3,size);
    }

    @Test
    public void testPushPopStack() {
        //Adiciona um elemento na pilha
        stack.push(10);
        stack.push(20);
        stack.push(30);
        int result = stack.pop();
        result = stack.pop();
        assertEquals(20,result);
    }

    @Test(expected = java.util.EmptyStackException.class)
    public void testEmptyStackException() {
        //Esperando uma excessão
        stack.push(10);
        int result = stack.pop();
        result = stack.pop();
    }
}