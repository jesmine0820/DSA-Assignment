/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ADT;

/**
 *
 * @author User
 */
public interface ListInterface<T> {
    void add(T element);
    boolean add(Integer newPosition, T element);
    T remove(Integer givenPosition);
    void clear();
    boolean replace(Integer givenPosition, T element);
    void update(T oldElement, T newElement);
    T getEntry(Integer givenPosition);
    T find(T element);
    boolean contains(T element);
    int size(); 
    boolean isEmpty();
    boolean isFull();
}
