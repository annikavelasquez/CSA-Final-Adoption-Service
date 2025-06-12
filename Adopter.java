public class Adopter 
{

    private String name;
    private String phone;

    public Adopter(String name, String phone) 
    {
        this.name = name;
        this.phone = phone;
    }

    public String toString() 
    {
        return "Adopter: " + name + ", Phone: " + phone;
    }
}
