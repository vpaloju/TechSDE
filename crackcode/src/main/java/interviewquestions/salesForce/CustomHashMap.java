package interviewquestions.salesForce;

import java.util.ArrayList;

public class CustomHashMap<K, V> {

  static class HashNode<K, V> {
    K key;
    V value;
    HashNode<K, V> next;

    HashNode(K key, V value) {
      this.key = key;
      this.value = value;
    }
  }

  private ArrayList<HashNode<K, V>> bucketArray;
  private int numBuckets;
  private int size;

  CustomHashMap() {
    bucketArray = new ArrayList<>();
    numBuckets = 10;
    size = 0;
    for (int i = 0; i < numBuckets; i++) {
      bucketArray.add(null);
    }
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public int getBucketIndex(K key) {
    int hashCode = key.hashCode();
    int index = hashCode % numBuckets;
    return index;
  }

  public V remove(K key) {
    int bucketIndex = getBucketIndex(key);
    HashNode<K, V> head = bucketArray.get(bucketIndex);
    HashNode<K, V> prev = null;
    while (head != null) {
      if (head.key == key) {
        break;
      }
      prev = head;
      head = head.next;
    }
    if (head == null) {
      return null;
    }
    size--;
    if (prev != null) {
      prev.next = head.next;
    } else {
      bucketArray.set(bucketIndex, head.next);
    }
    return head.value;
  }

  public V get(K key) {
    int bucketIndex = getBucketIndex(key);
    HashNode<K, V> head = bucketArray.get(bucketIndex);
    while (head != null) {
      if (head.key.equals(key)) {
        return head.value;
      }
      head = head.next;
    }
    return null;
  }

  public void add(K key, V value) {
    int bucketIndex = getBucketIndex(key);
    HashNode<K, V> head = bucketArray.get(bucketIndex);
    while (head != null) {
      if (head.key.equals(key)) {
        head.value = value;
        return;
      }
      head = head.next;
    }
    size++;
    head = bucketArray.get(bucketIndex);
    HashNode<K, V> newNode = new HashNode<>(key, value);
    newNode.next = head;
    bucketArray.set(bucketIndex, newNode);
    // If load factor goes beyond threshold, then double hash table size
    if ((1.0 * size) / numBuckets >= 0.7) {
      ArrayList<HashNode<K, V>> temp = bucketArray;
      bucketArray = new ArrayList<>();
      numBuckets = 2 * numBuckets;
      size = 0;
      for (int i = 0; i < numBuckets; i++) {
        bucketArray.add(null);
      }
      for (HashNode<K, V> headNode : temp) {
        while (headNode != null) {
          add(headNode.key, headNode.value);
          headNode = headNode.next;
        }
      }
    }
  }

  public static void main(String[] args) {
    CustomHashMap<String, Integer> customMap = new CustomHashMap<>();
    customMap.add("this", 1);
    customMap.add("coder", 2);
    customMap.add("this", 4);
    customMap.add("hi", 5);
    System.out.println(customMap.size());
    System.out.println(customMap.remove("this"));
    System.out.println(customMap.remove("this"));
    System.out.println(customMap.size());
    System.out.println(customMap.isEmpty());
  }
}
