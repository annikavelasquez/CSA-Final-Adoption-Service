public class Cat {
   
   private Pet pet;
   
   public Cat(String name, int age, String gender, String breed)
   {
       this.pet = new Pet(name, age, gender, breed);
   }
   
   public Pet getPet()
   {
       return pet;
   }
   
  
}
