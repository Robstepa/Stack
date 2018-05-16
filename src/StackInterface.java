public interface StackInterface<T> {
    T pop();
    void push(T t);
    T peek();
    boolean contains(T t);
}
