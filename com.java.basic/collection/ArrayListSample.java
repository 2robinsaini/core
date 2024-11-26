package collection;

import java.util.*;

public class ArrayListSample implements Comparator<Student> {

    public static void main(String[] args) {

        ArrayListSample arrayListSample = new ArrayListSample();

        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student(1,2,4,5,0,"Virat Kohli");
        Student s2 = new Student(11,12,6,10,4,"Rishabh Pant");
        Student s3 = new Student(17,6,1,15,1,"Surya Kumar");
        Student s4 = new Student(8,3,15,3,7,"Rohit Sharma");
        Student s5 = new Student(8,3,2,3,7,"Jaspreet Bumrah");
        Student s6 = new Student(18,13,2,3,17,"Hardik Pandya");

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);


        Map<Integer,String> mapStd = new HashMap<>();
        for(Student s : studentList){
            mapStd.put(s.sumOfMarks(),s.getName());
        }

        Collections.sort(studentList,arrayListSample);
        System.out.println("Student list is: " + studentList);
        System.out.println("Student Map is: " + mapStd);
        Integer sum = studentList.get(0).sumOfMarks();
        System.out.println("Topper is " + mapStd.get(sum) + ", with marks " + sum);



    }

    @Override
    public int compare(Student s1, Student s2) {
        return (s2.sumOfMarks() - s1.sumOfMarks());
    }
}
