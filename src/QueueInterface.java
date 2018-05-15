public interface QueueInterface<T> {

    void add(T t);
    T get();
}
