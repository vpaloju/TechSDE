package hackerRanker.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/grading/problem
 * Student  received a 73, and the next multiple of  from  is 75. Since 75-73<3, the student's grade is rounded to .
 * Student  received a 67, and the next multiple of  from  is 70. Since 70-73=3, the grade will not be modified and the student's final grade is .
 * Student  received a 38, and the next multiple of  from  is 40. Since 40-38<3, the student's grade will be rounded to .
 * Student  received a 33 grade below , so the grade will not be modified and the student's final grade is .
 */

public class StudentGrade {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        for(int i=0;i<grades.size();i++){
            if(grades.get(i)>=38){
                int nextMultipleOfFive = 5-(grades.get(i)%5)+grades.get(i);
                if(nextMultipleOfFive-grades.get(i)<3){
                    grades.set(i,nextMultipleOfFive);
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        List<Integer> result = gradingStudents(new ArrayList<Integer>(Arrays.asList(73,67,38,33)));
        for(Integer grade : result){
            System.out.println(grade);
        }
    }

}
