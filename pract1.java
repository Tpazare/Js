class student
{
    public int id ;
    public String std_name ;

    student(int id , String std_name)
    {
        this.id  = id ;
        this.std_name = std_name ;

    }

    public void display()
    {
        System.out.println("Student id is "+ id + "and  Student name is "+ std_name);
        System.out.println();
    }


}
public class pract1
{
    public static void main(String[] args) {
        student [] arr ;

        arr = new student[2];

        arr[0] = new student(01, "tejas Pazare");

        arr[1] = new student(02, "Rohit Kamble");

        System.out.println("Student data in arr 0: ");
        arr[0].display();
        System.out.println("Student data in arr 1: ");
        arr[1].display();
    }
}