package mood3;


public interface GameObject<E, P> {

    String getUsername();
    E getHashedPassword();
    int getLevel();
    P getSpecialPoints();
    P getSpecialResult();
    void setHashedPassword(E element);
    void hashPassword();

}
