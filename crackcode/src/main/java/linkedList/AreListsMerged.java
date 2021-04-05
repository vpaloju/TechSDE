package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AreListsMerged {

  public static int listsAreMerged(LinkedList<Integer> list1, LinkedList<Integer> list2) {
    LinkedList smallList, largeList;
    int counter = 0, diffInSize = Math.abs(list1.size() - list2.size());
    if (list1.size() > list2.size()) {
      largeList = list1;
      smallList = list2;
    } else {
      largeList = list2;
      smallList = list1;
    }
    Iterator<Integer> smallListIterator = smallList.iterator();
    Iterator<Integer> largeListIterator = largeList.iterator();
    while (largeListIterator.hasNext()) {
      int listValue = largeListIterator.next();
      if (counter < diffInSize) {
        counter++;
        continue;
      }
      if (listValue == smallListIterator.next()) {
        return listValue;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    LinkedList<Integer> l1 = new LinkedList<Integer>();
    LinkedList<Integer> l2 = new LinkedList<Integer>();
    l1.add(11);
    l1.add(13);
    l1.add(16);
    l1.add(19);
    l1.add(22);
    l1.add(23);

    l2.add(12);
    l2.add(14);
    l2.add(19);
    l2.add(22);
    l2.add(23);

    System.out.println("Lists Are Merged At: " + listsAreMerged(l1, l2));
  }
}
