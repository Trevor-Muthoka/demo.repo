//136509 Muthoka Trevor Ndinda ICS B
public class Watch {
    private String name;
    private String type;
    private int yom;
    int age;

    public void Watch(String name)
    {
        this.name=name;
    }
    public void Watch(String name,String type,int yom)
    {
        this.name=name;
        this.type=type;
        this.yom=yom;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYom(int yom) {
        this.yom = yom;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    public int getAge()
    {
        age=2021-yom;
        return age;
    }
    public void showDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
        System.out.println("Age: "+age+" years old");
    }
}
