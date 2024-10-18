class Circle extends Shape {

    private int x, y, radius;  // Extrinsic properties


    public Circle(String color) {
        super(color);  // Color is the intrinsic property managed by the parent class
    }

    // Constructor that accepts a renderer
    public Circle(Renderer renderer) {
        super(renderer);
    }

    // Setters for the extrinsic properties
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // The unified draw method that either uses the renderer or prints directly
    @Override
    public void draw() {
        if (renderer != null) {
            // Use the renderer if it's provided
            renderer.renderShape("Circle");
        } else {
            // Fall back to standard drawing behavior if no renderer is provided
            System.out.println("Drawing Circle [Color: " + color + ", x: " + x + ", y: " + y + ", radius: " + radius + "]");
        }
    }
}
