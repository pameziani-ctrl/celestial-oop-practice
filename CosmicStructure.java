import java.util.ArrayList;
import java.util.List;

public class CosmicStructure extends UniverseComponent {

    private List<UniverseComponent> children;
    private CelestialBody center;

    public CosmicStructure(String name, double age, double radius, CelestialBody center) {
        super(name, age, radius);
        this.center = center;
        this.children = new ArrayList<>();
    }

    // Getters
    public CelestialBody getCenter() { return center; }
    public List<UniverseComponent> getChildren() { return children; }

    public void add(UniverseComponent component) {
        if(component.getName().equals(name)){
            System.out.println("Cannot add element by the same name as the structure");
            return;
        }
        if(children.contains(component)){
            System.out.println(component.getName() + " is already a child of " + name);
            return;
        }
        children.add(component);
        System.out.println(component.name + " added to " + name + "!");
    }

    public void remove(UniverseComponent component) {
        if(children.isEmpty()){
            System.out.println("This structure doesn't have children");
            return;
        }
        if(!children.contains(component)){
            System.out.println(component.getName() + " isn't a child of " + name);
            return ;
        }
        if(children.remove(component)){
            System.out.println(component.getName() + " removed from " + name);
            return;
        }else
            System.out.println("Error removing " + component.getName() + " from " + name);
    }

    public void printStructure(String indent) {
        System.out.println(indent + "Structure Name: " + getName());
        System.out.println(indent + "Age: " + getAgeInBillionsOfYears() + " Billion year");
        System.out.println(indent + "Radius: " + getRadius() + " Km");
        System.out.println(indent + "=======================");

        for (UniverseComponent child : children) {
            if (child instanceof CelestialBody) {
                ((CelestialBody) child).print(indent + "    ");
            } else if (child instanceof CosmicStructure) {
                ((CosmicStructure) child).printStructure(indent + "    ");
            }
        }

    }

}

