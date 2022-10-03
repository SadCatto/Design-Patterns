public abstract class ShapeDecoration implements Shape {
    protected Shape decoratedShape;

    public ShapeDecoration(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
