public class Cone extends Shape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surface_area() {
        double slant = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slant);
    }

    @Override
    public double volume() {
        return (Math.PI * radius * radius * height) / 3.0;
    }

    @Override
    public String toString() {
        return "Cone Surface Area = " + surface_area() +
                ", Volume = " + volume();
    }
}


