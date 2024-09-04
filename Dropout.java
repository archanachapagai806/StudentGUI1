
/**
 * Write a description of class Dropout here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dropout extends Student
{
    int numOfRemainingModules;
    int numOfMonthsAttended;
    String dateOfDropout;
    int remainingAmount;
    boolean hasPaid;

    public Dropout(String dateOfBirth,String studentName,int courseDuration,int tuitionFee,
    int numOfRemainingModules,int numOfMonthsAttended,String dateofDropout, int enrollmentID, String courseName, String dateOfEnrollment)
    {
        super(dateOfBirth,studentName,courseDuration,tuitionFee);
        super.setEnrollmentID(enrollmentID);
        super.setCourseName(courseName);
        super.setDateOfEnrollment(dateOfEnrollment);
        this.numOfRemainingModules=numOfRemainingModules;
        this.numOfMonthsAttended=numOfMonthsAttended;
        this.dateOfDropout=dateOfDropout;
        this.remainingAmount=0;
        this.hasPaid= false;
    }

    public int getNumOfRemainingModules(){
        return numOfRemainingModules;
    }

    public int getNumOfMonthsAttended(){
        return numOfMonthsAttended;
    }

    public String getDateOfDropout(){
        return dateOfDropout;
    }

    public int getRemainingAmount(){
        return remainingAmount;
    }

    public boolean getHasPaid(){
        return hasPaid;
    }
    
    public void billsPayable(){
        remainingAmount = (getCourseDuration()-numOfMonthsAttended) *getTutionFee();
        hasPaid= true;
    }

    public void removeStudent() {
        if(hasPaid) {
            
            super.setCourseName("");
            super.setDateOfBirth("");
            super.setStudentName("");
            super.setDateOfEnrollment("");
            super.setCourseDuration(0);
            super.setTuitionFee(0);
            this.dateOfDropout="";
            super.setEnrollmentID(0);
            this.numOfRemainingModules=0;
            this.numOfMonthsAttended=0;
            this.remainingAmount=0;
        
        } else {
            System.out.println("all bills not cleared");
        }
    }

    public void display() {
        super.display();
        System.out.println("Number of Remaining modules:" + numOfRemainingModules);
        System.out.println("Number of Months attended:" + numOfMonthsAttended);
        System.out.println("Date of Dropout:" + dateOfDropout);
        System.out.println("Remaining Amount:" + remainingAmount);

    }

}

