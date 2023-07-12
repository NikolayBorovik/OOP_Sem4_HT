package OOP_Seminar4.OOP_Sem4_HT;

public interface GBLinked<T>  {
    void addLast(T t);
    void addFrst(T t);
    int size();
    T getEl(int index);
}
