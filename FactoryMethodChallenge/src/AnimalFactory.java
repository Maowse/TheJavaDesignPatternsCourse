public class AnimalFactory extends AbstractAnimalFactory {
    public Animal getAnimalType(String animalType) throws Exception{
        switch(animalType){
            case "DUCK":
                return new Duck();
            case "TIGER":
                return new Tiger();
            default:
                throw new Exception("Animal type: " + animalType + " cannot be instantiated");
        }
    }
}
