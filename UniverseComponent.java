public abstract class UniverseComponent {
    protected  String name;
    protected double ageInBillionsOfYears;
    protected double radius;

    // Constructor
    public UniverseComponent(String name, double ageInBillionsOfYears, double radius) {
        this.name = name;
        this.ageInBillionsOfYears = ageInBillionsOfYears;
        this.radius = radius;
    }

    // Getters
    public String getName() { return name; }
    public double getAgeInBillionsOfYears() { return ageInBillionsOfYears; }
    public double getRadius() { return radius; }
    public void print(){
         System.out.println("Name: " + name);
         System.out.println("Age in Billions of years: " + ageInBillionsOfYears);
         System.out.println("radius: " + radius);
    }
}
