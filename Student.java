
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int enrollmentID;
    private String dateOfBirth;
    private String courseName;
    private String studentName;
    private String dateOfEnrollment;
    private int courseDuration;
    private int tuitionFee;

    //constructor
    public Student (String dateOfBirth,String studentName,int courseDuration,
    int tuitionFee){
        this.dateOfBirth=dateOfBirth;
        this.studentName=studentName;
        this.courseDuration=courseDuration;
        this.tuitionFee = tuitionFee;
        this.enrollmentID=0;
        this.dateOfEnrollment="";
        this.courseName="";
    }

    public int getEnrollmentId() {
        return enrollmentID;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCourseName(){
        return courseName;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public int getTutionFee() {
        return tuitionFee;
    }

    public void setEnrollmentID(int enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public void setStudentName(String studentName ) {
        this.studentName =studentName;
    }

    public void setDateOfBirth(String  dateOfBirth ) {
        this.dateOfBirth=dateOfBirth;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration=courseDuration ;
    }
    
    public void setTuitionFee(int tuitionFee) {
        this.tuitionFee= tuitionFee;
    }
    
    public void setDateOfEnrollment(String dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public void display() {
        if (enrollmentID == 0 || courseName == "" || dateOfEnrollment == "") {
            System.out.println("All Attributes have not been set for this Student.");
        }else {
            int yearEnrolled= courseDuration / 12;
            System.out.println("Years Enrolled:" + yearEnrolled);
            System.out.println("Course Duration:" + courseDuration + "months");
            System.out.println("Tution Fee: $" + tuitionFee);
            System.out.println("Enrollment ID:" + enrollmentID);
            System.out.print("Date Of Birth:" + dateOfBirth);
            System.out.print("Course Name:" + courseName);
            System.out.println("Student Name:" + studentName);
        }
    }

}
