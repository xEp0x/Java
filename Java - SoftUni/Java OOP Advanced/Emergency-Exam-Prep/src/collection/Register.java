package collection;


public interface Register<T> {

    void enqueueEmergency(T emergency);

    T dequeueEmergency();

    Integer count();

    Boolean isEmpty();
}
