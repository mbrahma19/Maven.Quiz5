package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    private List<Student> studentList;

    public ZipCodeWilmington(){
        studentList = new ArrayList<>();
    }

    public void enroll(Student student) {
        if(!isEnrolled(student)){
            studentList.add(student);
        }
    }

    public Boolean isEnrolled(Student student) {
        return studentList.contains(student);
    }

    public void lecture(double numberOfHours) {
        studentList.forEach(student -> student.learn(numberOfHours));
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student,Double> mapping = new LinkedHashMap<>();
        studentList.forEach(student -> mapping.put(student,student.getTotalStudyTime()));
        return mapping;
    }
}
