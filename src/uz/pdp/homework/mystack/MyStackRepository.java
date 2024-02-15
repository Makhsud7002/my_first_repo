package uz.pdp.homework.mystack;

public interface MyStackRepository<E> {


    E push(E item);
    E pop();
    E peek();
    boolean empty();
    int search(Object o);

}
