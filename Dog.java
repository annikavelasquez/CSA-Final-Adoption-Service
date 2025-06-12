public class Dog {
  
   private Pet pet;
   
   public Dog(String name, int age, String gender, String breed)
   {
       this.pet = new Pet(name, age, gender, breed);
   }
   
   public Pet getPet()
   {
       return pet;
   }
   
  
}
