import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MyArrayList {
    private static  final int CAPASITY = 10;
    private int size;
    private Plane[] elements;
    public MyArrayList(int initialcapasity){
        if(initialcapasity <= 0){
            initialcapasity = CAPASITY;
        }
        elements = new Plane[initialcapasity];
    }
    public void add(Plane e){
        ensureCapasity(1);
            elements[size] = e;
            size++;
    }
    private void ensureCapasity(int minCapacity){
        int currentCapacity = elements.length;
        if (minCapacity > currentCapacity) {
            int newCapacity = Math.max(minCapacity, currentCapacity * 2);
            Plane[] newElements = new Plane[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }
    public void allFull(Plane e){
        for (int i = 0; i < elements.length; i++) {
            elements[i] = e;
        }
    }
    public void add( Plane e, int index){
        ensureCapasity(1);
        for (int i = size; i > index; i--) {
            elements[i] = elements[i-1];
        }
        elements[index] = e;
        size++;
    }
    public void addAll(Plane[] c){
        ensureCapasity(c.length + size);
        for (int i = 0; i < c.length; i++) {
            elements[size] = c[i];
            size++;
        }
    }
    public void addAll(Plane[] c, int index){
        ensureCapasity(c.length + size);
//        сдвигаем;
        for (int i = size - 1; i >= index; i--) {
            elements[i + c.length] = elements[i];
        }
        for (int i = 0; i < c.length; i++) {
            elements[index + i] = c[i];
        }
        size += c.length;
    }
    public Plane get(int index){
       return elements[index];
    }
    public Plane remove(int index){
        Plane removedElement = elements[index];
        for (int i = index + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        size--;
        if (size < elements.length / 2) {
            int newCapacity = Math.max(elements.length / 2, CAPASITY);
            Plane[] newElement = new Plane[newCapacity];
            System.arraycopy(elements, 0, newElement, 0, size);
            elements = newElement;
        }
        return removedElement;
    }
    public int size(){
        return size;
    }
    public void vyvod(){
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }
}
