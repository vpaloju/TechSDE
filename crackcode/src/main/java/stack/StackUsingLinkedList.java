package stack;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class StackUsingLinkedList<T> implements Iterable {

  LinkedList<T> list = new LinkedList<T>();

  public StackUsingLinkedList() {
  }

  public StackUsingLinkedList(T firstElement) {
    push(firstElement);
  }

  public int size() {
    return list.size();
  }

  public boolean isEmpty() {
    return list.size() == 0;
  }

  public void push(T element) {
    list.addLast(element);
  }

  public T pop(T element) {
    if (list.isEmpty()) {
      throw new EmptyStackException();
    }
    return list.removeLast();
  }

  public T peek() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return list.peekLast();
  }

  @Override
  public Iterator iterator() {
    return list.iterator();
  }
}
