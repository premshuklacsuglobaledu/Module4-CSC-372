public class ShapeArray {
    public static void main(String[] args) {

        Shape sphere = new Sphere(5);
        Shape cylinder = new Cylinder(3, 8);
        Shape cone = new Cone(4, 6);

        Shape[] shapeArray = { sphere, cylinder, cone };

        for (Shape s : shapeArray) {
            System.out.println(s.toString());
        }
    }
}
