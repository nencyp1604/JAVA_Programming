class faculty
{
    String facultyName;
    int facultyAge;
}
public class facultyDemo
{
    public static void main(String[] args)
    {
        faculty f = new faculty();
        f.facultyName="xyz";
        f.facultyAge=123;

        System.out.println(f.facultyName);
    }
}