/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADT;

/**
 *
 * @author User
 */
public class ArrayList<T> implements ListInterface<T> {
    
    private T[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 100;
    
    // Constructor
    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayList(int capacity) {
        array = (T[]) new Object[capacity]; // Java does not allow direct generic array creation
        size = 0;
    }

    // Getter 
    public int getSize() {
        return size;
    }
    
    // Add new element into list
    @Override
    public void add(T element){
        ensureCapacity();
        array[size++] = element;
    }
    
    // Add an element at a specific position
    @Override
    public boolean add(Integer newPosition, T element){
        if (newPosition < 0 || newPosition > size){
            return false;
        }
        ensureCapacity();
        
        
    }
    
    @Override
    public T remove(Integer givenPosition){
        
    }
    
    @Override 
    public void clear(){
        
    }
    
    @Override
    public boolean replace(Integer givenPosition, T element){
        
    }
    
    @Override
    public void update (T oldElement, T newElement){
        
    }
    
    @Override
    public T getEntry(Integer givenPosition){
        
    }
    
    @Override
    public T find(T element){
        
    }
    
    @Override
    public boolean contains(T element){
        
    }
    
    @Override
    public int size(){
        
    }
    
    @Override
    public boolean isEmpty(){
        
    }
    
    @Override 
    public boolean isFull(){
        
    }
    
    // Function to ensure the capacity
    private void ensureCapacity(){
        if(size == array.length){
            int newCapacity = array.length * 2;
            T[] newArray = (T[]) new Object[newCapacity];
            
            for (int i = 0; i < size; i++){
                newArray[i] = array[i];
            }
            
            array = newArray;
        }
    }
}
