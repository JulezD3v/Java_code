package Assignment;

class ReactorComponent {
    private String componentName;
    private double mass;
    private double temperature;

    public ReactorComponent(String componentName, double mass, double temperature) {
        this.componentName = componentName;
        this.mass = mass;
        this.temperature = temperature;
    }

    public void displayInfo() {
        System.out.println("Component: " + componentName);
        System.out.println("Mass: " + mass + " kg");
        System.out.println("Temperature: " + temperature + " °C");
    }

    public static void main(String[] args) {
        ReactorComponent r1 = new ReactorComponent("Catalyst A", 12.5, 350.0);
        r1.displayInfo();
    }
}

