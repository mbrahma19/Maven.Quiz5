package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    private Double hoursLearned;
    private Integer id;

    public Student() {
        this(null);
    }

    public Student(Integer id) {
        this.id = id;
        hoursLearned = 0.0;
    }

    public void learn(Double amountOfHours) {
        hoursLearned+=amountOfHours;
    }

    public Double getTotalStudyTime() {
        return hoursLearned;
    }
}
