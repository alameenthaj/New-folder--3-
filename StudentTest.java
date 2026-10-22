class Student {
    
    private String name;
    private int rollNo;
    private double percentage;

    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name; 
    }

    
    public int getRollNo() {
        return rollNo;
    }

    
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    
    public double getPercentage() {
        return percentage;
    }


    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Alex Morgan");
        student.setRollNo(101);
        student.setPercentage(88.5);

        
        System.out.println("--- Student Profile ---");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNo());
        System.out.println("Percentage: " + student.getPercentage() + "%");
    }
}
