import java.util.Objects;
public class Student
{
    private String name;
    private int id;

    Student(String n, int i)
    {
        name = n;
        id = i;
    }
    void setName(String n)
    {
        name = n;
    }


    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Student))
            return false;

        if (o==this)
            return true;
        
        Student s = (Student) o;
        return name.equals(s.name) && id ==s.id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, id);
    }


}
