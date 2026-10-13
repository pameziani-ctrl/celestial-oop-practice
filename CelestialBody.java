public class CelestialBody extends UniverseComponent {
    private double massInKg;
    private double averageDensity;
    private double orbitalPeriod;
    private double rotationPeriod;
    private double distanceFromParent;
    private double surfaceTemp;

    // Constructor
    public CelestialBody(String name, double age, double radius, double massInKg, 
                         double averageDensity, double orbitalPeriod, double rotationPeriod, 
                         double distanceFromParent, double surfaceTemp) {
        super(name, age, radius); // Passes standard fields up to parent
        this.massInKg = massInKg;
        this.averageDensity = averageDensity;
        this.orbitalPeriod = orbitalPeriod;
        this.rotationPeriod = rotationPeriod;
        this.distanceFromParent = distanceFromParent;
        this.surfaceTemp = surfaceTemp;
    }

    // Getters
    public double getmassInKg() { return massInKg; }
    public double getaverageDensity() { return averageDensity; }
    public double getorbitalPeriod() { return orbitalPeriod; }
    public double getrotationPeriod() { return rotationPeriod; }
    public double getdistanceFromParent() { return distanceFromParent; }
    public double getsurfaceTemp() { return surfaceTemp; }
 
    public void print(String indent) {
    // We add the indent string at the front to push the text to the right
    System.out.println(indent + "Body Name: " + getName());
    System.out.println(indent + "Age: " + getAgeInBillionsOfYears() + " Billion year");
    System.out.println(indent + "Radius: " + getRadius() + " Km");
    System.out.println(indent + "-----------------------");
}

}
