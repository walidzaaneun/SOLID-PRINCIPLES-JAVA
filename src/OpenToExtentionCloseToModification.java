public class OpenToExtentionCloseToModification {
}

interface shape {
    double calculateArea();
}
class Rectangle implements shape{
    public double width;
    public double height;

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Circle implements shape{
    public double radius;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator {
    public double calculateRectangleArea(shape shape) {
        return shape.calculateArea();
    }
}