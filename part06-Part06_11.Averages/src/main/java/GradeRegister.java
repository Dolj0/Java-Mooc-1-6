
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades(){
        
        if (grades.isEmpty()) {
            return -1;
        }
        
        int sumOfFive =5 * numberOfGrades(5);
        int sumOfFour =4 * numberOfGrades(4);
        int sumOfThree =3 * numberOfGrades(3);
        int sumOfTwo =2 * numberOfGrades(2);
        int sumOfOne =1 * numberOfGrades(1);
        int sumOfZero =0 * numberOfGrades(0);
        
        double d = 1.0*(sumOfFive+sumOfFour+sumOfThree+sumOfTwo+sumOfOne+sumOfZero);
        double f = d/grades.size();
        
        return f;  
    }
    
    public double averageOfPoints(){
        
        if (grades.isEmpty()) {
            return -1;
        }
        
        int j = 0;
        for (int i = 0; i<points.size(); i++){
            j=j+points.get(i);
        }
        
        double d = 1.0*j/points.size();
        return d;
        
    }
    
    
}
