abstract class Shape {
    protected Renderer renderer;

    Shape(Renderer renderer) {
        this.renderer = renderer;
    }
    protected String color;

    public Shape(String color) {
        this.color = color;
    }


    abstract void draw();
}