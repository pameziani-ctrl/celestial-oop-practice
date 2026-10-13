# Celestial OOP Practice System

A modular, object-oriented system designed in Java to model the structures of our universe. This project practices system design architectures, specifically exploring hierarchical structures using a safe, custom structural traversal algorithm.

##  The System Architecture
This project applies the **Composite Design Pattern**, allowing individual celestial entities and entire cosmic collections to share uniform identification tracking.

Here is the exact structural model of the system:

```mermaid
classDiagram
    class UniverseComponent {
        <<abstract>>
        -String name
        -double ageInBillionsOfYears
        -double radius
        +getName() String
        +getAgeInBillionsOfYears() double
        +getRadius() double
    }

    class CelestialBody {
        -double massInKg
        -double averageDensity
        -double orbitalPeriod
        -double rotationPeriod
        -double distanceFromParent
        -double surfaceTemp
        +getmassInKg() double
        +getaverageDensity() double
        +getorbitalPeriod() double
        +getrotationPeriod() double
        +getdistanceFromParent() double
        +getsurfaceTemp() double
        +printStructure(String indent) void
    }

    class CosmicStructure {
        -List~UniverseComponent~ children
        -CelestialBody Center
        +add(UniverseComponent component) void
        +remove(UniverseComponent component) void
        +printStructure(String indent) void
    }

    UniverseComponent <|-- CelestialBody : Extends
    UniverseComponent <|-- CosmicStructure : Extends
    CosmicStructure "1" *-- "0..*" UniverseComponent : Contains (Children)
```

## 🛠️ Compilation & Local Run
To compile and execute the system tracking directly via your terminal, use:

```bash
javac Main.java
java Main
```
