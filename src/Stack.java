public class Stack<T> implements StackInterface<T> {

    private final T[] array;
    private int top = -1;

    public Stack() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public Stack(int size){
        this.array = ((T[]) new Object[size]);
    }

    @Override
    public T pop() {
        if (isEmpty()){
            throw new CustomStackException("Your stack is empty!");
        }
        return array[top--];
    }

    @Override
    public void push(T t) {
        if (isFull()){
            throw new CustomStackException("Your stack is full!");
        }
        array[++top] = t;
    }

    @Override
    public T peek() {
        if (isEmpty()){
            throw new CustomStackException("Your stack is empty!");
        }
        return array[top];
    }

    @Override
    public boolean contains(T t){
        for (T element : array){
            if (element.equals(t)){
                return true;
            }
        }
        return false;
    }

    private boolean isFull(){
        return top == array.length - 1;
    }

    private boolean isEmpty(){
        return top == -1;
    }
}
