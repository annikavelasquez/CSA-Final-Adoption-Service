import java.util.*;

public class CatAndDogAdoptionApp 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        PetDatabase db = new PetDatabase();

        boolean running = true;
        System.out.println("Welcome to the Cat & Dog Adoption Center!");

        while (running) 
        {
            System.out.print("\nWould you like to view cats or dogs? (cat/dog/end): ");
            String type = input.nextLine().toLowerCase();

            if (type.equals("end")) 
            {
                System.out.println("Thanks for visiting. Goodbye!");
                running = false;
            } 
            else if (type.equals("cat"))
            {
                ArrayList<Cat> availableCats = db.getAvailableCats();
                if (availableCats.size() == 0) 
                {
                    System.out.println("No cats available.");
                } 
                else
                {
                    for (int i = 0; i < availableCats.size(); i++) 
                    {
                        System.out.println((i + 1) + ". " + availableCats.get(i).getPet().getBasicInfo());
                    }

                    System.out.print("Select a number to view or type 'back': ");
                    String choice = input.nextLine();

                    if (!choice.equals("back") && isNumeric(choice)) 
                    {
                        int index = getNumber(choice) - 1;

                        if (index >= 0 && index < availableCats.size()) 
                        {
                            Cat selected = availableCats.get(index);
                            Pet pet = selected.getPet();

                            boolean viewing = true;
                            while (viewing) 
                            {
                                System.out.println("\n" + pet.getBasicInfo());
                                System.out.println("1. Pet");
                                System.out.println("2. Play");
                                System.out.println("3. Adopt");
                                System.out.println("4. Back");
                                System.out.print("Choose: ");
                                String action = input.nextLine();

                                if (action.equals("1")) 
                                {
                                    pet.petAnimal();
                                } 
                                else if (action.equals("2")) 
                                {
                                    pet.playAnimal();
                                } 
                                else if (action.equals("3")) 
                                {
                                    System.out.print("Name: ");
                                    String name = input.nextLine();
                                    System.out.print("Phone: ");
                                    String phone = input.nextLine();
                                    new Adopter(name, phone);
                                    pet.adopt();
                                    System.out.println("You adopted " + pet.getName() + "!");
                                    viewing = false;
                                } 
                                else if (action.equals("4")) 
                                {
                                    viewing = false;
                                }
                            }
                        }
                    }
                }

            } 
            else if (type.equals("dog")) 
            {
                ArrayList<Dog> availableDogs = db.getAvailableDogs();
                if (availableDogs.size() == 0) 
                {
                    System.out.println("No dogs available.");
                } 
                else
                {
                    for (int i = 0; i < availableDogs.size(); i++) 
                    {
                        System.out.println((i + 1) + ". " + availableDogs.get(i).getPet().getBasicInfo());
                    }

                    System.out.print("Select a number to view or type 'back': ");
                    String choice = input.nextLine();

                    if (!choice.equals("back") && isNumeric(choice))
                    {
                        int index = getNumber(choice) - 1;

                        if (index >= 0 && index < availableDogs.size()) 
                        {
                            Dog selected = availableDogs.get(index);
                            Pet pet = selected.getPet();

                            boolean viewing = true;
                            while (viewing) 
                            {
                                System.out.println("\n" + pet.getBasicInfo());
                                System.out.println("1. Pet");
                                System.out.println("2. Play");
                                System.out.println("3. Adopt");
                                System.out.println("4. Back");
                                System.out.print("Choose: ");
                                String action = input.nextLine();

                                if (action.equals("1")) 
                                {
                                    pet.petAnimal();
                                } 
                                else if (action.equals("2")) 
                                {
                                    pet.playAnimal();
                                } 
                                else if (action.equals("3")) 
                                {
                                    System.out.print("Name: ");
                                    String name = input.nextLine();
                                    System.out.print("Phone: ");
                                    String phone = input.nextLine();
                                    new Adopter(name, phone);
                                    pet.adopt();
                                    System.out.println("You adopted " + pet.getName() + "!");
                                    viewing = false;
                                } 
                                else if (action.equals("4"))
                                {
                                    viewing = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        input.close();
    }

   
    public static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return str.length() > 0;
    }

   
    public static int getNumber(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            num = num * 10 + (str.charAt(i) - '0');
        }
        return num;
    }
}



