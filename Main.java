public class Main {
    public static void main(String[] args) {
        System.out.println("=== Initializing Celestial Objects ===");

        CelestialBody sun = new CelestialBody("The Sun", 4.6, 696340, 1.989e30, 1408, 0, 609, 0, 5778);
        CelestialBody earth = new CelestialBody("Earth", 4.54, 6371, 5.972e24, 5514, 365.25, 24, 1.0, 288);
        CelestialBody moon = new CelestialBody("The Moon", 4.51, 1737, 7.342e22, 3344, 27.3, 655.7, 0.0025, 250);

        CosmicStructure earthSystem = new CosmicStructure("Earth-Moon System", 4.54, 384400, earth);
        earthSystem.add(moon); // Testing your add method

        CosmicStructure solarSystem = new CosmicStructure("Solar System", 4.6, 149597870, sun);
        solarSystem.add(earthSystem); // Testing nested structures

        // 3. Trigger your custom printing method
        System.out.println("\n=== Testing printStructure() ===");
        solarSystem.printStructure("");
        
        // 4. Verification Check
        System.out.println("\n=== Verification ===");
        System.out.println("Structure Center: " + solarSystem.getCenter().getName());
        System.out.println("Total child structures inside Solar System: " + solarSystem.getChildren().size());
    }
}
