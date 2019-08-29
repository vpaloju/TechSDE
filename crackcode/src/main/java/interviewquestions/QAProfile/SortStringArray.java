package interviewquestions.QAProfile;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortStringArray {

    public static void sort(String[] strArray) {

        Set<String> set = new TreeSet<>();
        for (int i = 0; i < strArray.length; i++) {
            set.add(strArray[i]);
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        String a = new String("xyz");
        String b = "xyz";
        System.out.println(a.equals(b));
        sort(new String[]{"abcd", "ijkl", "mnop", "efgh", "acdb"});
    }
}
