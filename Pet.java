public class Pet
{
    private String name;
    private int age;
    private String gender;
    private String breed;
    private boolean adopted;
    private int moodLevel;
    private int playfulness;

    public Pet(String name, int age, String gender, String breed)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
        this.adopted = false;

        this.moodLevel = (int)(Math.random() * 10) + 1;
        this.playfulness = (int)(Math.random() * 10) + 1;   
    }

    public String getName() 
    {
        return name;
    }

    public boolean isAdopted() 
    {
        return adopted;
    }

    public void adopt() 
    {
        adopted = true;
    }

    public String getBasicInfo()
    {
        return name + " - " + age + " yrs - " + gender + " - " + breed + (adopted ? " (Adopted)" : "");
    }

    public void petAnimal() 
    {
        moodLevel++;
        if (moodLevel > 10) 
        {
            moodLevel = 10;
        }

        System.out.print(name + " seems ");

        if (moodLevel <= 3) 
        {
            System.out.println("a little grumpy. Mood level: " + moodLevel + "/10.");
        }
        else if (moodLevel <= 7) 
        {
            System.out.println("content. Mood level: " + moodLevel + "/10.");
        } 
        else
        {
            System.out.println("very happy! Mood level: " + moodLevel + "/10.");
        }
    }

    public void playAnimal()
    {
        playfulness++;
        if (playfulness > 10) 
        {
            playfulness = 10;
        }

        System.out.print(name + " is ");

        if (playfulness <= 3) 
        {
            System.out.println("not very playful right now. Playfulness: " + playfulness + "/10.");
        } 
        else if (playfulness <= 7)
        {
            System.out.println("somewhat playful. Playfulness: " + playfulness + "/10.");
        } 
        else 
        {
            System.out.println("super energetic and playful! Playfulness: " + playfulness + "/10.");
        }
    }
}
