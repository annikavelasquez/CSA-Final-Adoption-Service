import java.util.ArrayList;

public class PetDatabase 
{
    private ArrayList<Cat> cats;
    private ArrayList<Dog> dogs;

    public PetDatabase() 
    {
        cats = new ArrayList<>();
        dogs = new ArrayList<>();

        cats.add(new Cat("Daisy", 2, "Female", "Siamese"));
        cats.add(new Cat("Marshmallow", 3, "Male", "Siberian"));

        dogs.add(new Dog("Rocky", 4, "Male", "Corgi"));
        dogs.add(new Dog("Luna", 1, "Female", "Dachshund"));
    }

    public ArrayList<Cat> getAvailableCats() 
    {
        ArrayList<Cat> result = new ArrayList<>();
        for (Cat c : cats)
        {
            if (!c.getPet().isAdopted())
            {
                result.add(c);
            }
        }
        return result;
    }

    public ArrayList<Dog> getAvailableDogs() 
    {
        ArrayList<Dog> result = new ArrayList<>();
        for (Dog d : dogs) 
        {
            if (!d.getPet().isAdopted()) 
            {
                result.add(d);
            }
        }
        return result;
    }
}
