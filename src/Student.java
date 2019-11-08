public class Student {
    private String name;
    private int age;
    private boolean gender;
    private String idno;

    public Student(String name, int age, boolean gender, String idno)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idno = idno;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(boolean gender)
    {
        this.gender = gender;
    }
    public void setIdno(String idno)
    {
        this.idno = idno;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
    public boolean getGender()
    {
        return this.gender;
    }
    public String getIdno()
    {
        return this.idno;
    }
    public void printInfo()
    {
        String s = "Name: " + this.name + "\n"
                +   "Age: " + this.age + "\n"
                +   "Gender: " + ((this.gender)? "Male" : "Female") + "\n"
                +   "ID no: " + this.idno;
        System.out.println(s);
    }
}
