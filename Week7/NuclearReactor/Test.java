package NuclearReactor;

public class Test {
    public static void main(String[] args) {
        PowerPlant pp1 = new PowerPlant(120);
        Reactor r1 = new Reactor(150);
        PlantController pc1 = new PlantController(pp1, r1);

        pc1.runSystem(r1, pp1);
    }


}
