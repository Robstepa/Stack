public class Queue<T> implements QueueInterface<T> {

    private T[] array;
    private int pointer = 0;

    public Queue(){
        this.array = ((T[]) new Object[2]);
    }

    @Override
    public void add(T t) {
        ensureCapacity();
        move();
        array[0] = t;
        pointer++;
    }

    @Override
    public T get() {
        return array[0];
    }

    private void ensureCapacity(){
        if (pointer == array.length-1){
            T[] temp = ((T[]) new Object[array.length * 2]);
            for (int i = 0; i < array.length-1; i++){
                temp[i] = array[i];
            }
            array = temp;
        }
    }

    private void move(){
        T temp = array[0];
        for (int i = 1; i < array.length-1; i++){
            T temp1 = array[i];
            array[i] = temp;
            temp = temp1;
        }
    }

    public void showAll(){
        for(T t : array){
            System.out.println(t);
        }
    }
}
