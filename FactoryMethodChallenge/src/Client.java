public class Client {
    public static void main(String[] args) throws Exception{
        AbstractAnimalFactory factory = new AnimalFactory();

        Animal tiger = factory.getAnimalType("TIGER");
        tiger.eat();

        Animal duck = factory.getAnimalType("DUCK");
        duck.eat();

        // this should throw an exception
        try {
            factory.getAnimalType("Non-Existent Animal");
        }
        catch(Exception e){
            System.out.println("Got expected exception: " + e.getMessage());
        }
    }
}
