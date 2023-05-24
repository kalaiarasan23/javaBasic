class School
{
private int salary; 
// private, protected, public --> fields

private void recruit()
{
    System.out.println("recuit");
}

    public static void main(String[] args)
    {
    School teacher = new School(); 
    teacher.salary = 20000; 
    School physics_teacher = new School(); 
    physics_teacher.salary = 25000;  
    teacher.teach();
    teacher.recruit();
    }

void teach()
{
    int ab=10; 
    System.out.println(ab);
}

}
