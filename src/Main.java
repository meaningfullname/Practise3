public class Main {
    public static void main(String[] args) {
        // Adapter Pattern
        System.out.println("Adapter Pattern:");
        LegacyOrderProcessor legacyProcessor = new LegacyOrderProcessor();
        NewOrderProcessor adapter = new OrderAdapter(legacyProcessor);
        adapter.processNewOrder();

        // Bridge Pattern
        System.out.println("\nBridge Pattern:");
        Renderer windowsRenderer = new WindowsRenderer();
        Renderer linuxRenderer = new LinuxRenderer();
        Shape circle = new Circle(windowsRenderer);
        Shape square = new Square(linuxRenderer);
        circle.draw();
        square.draw();

        // Composite Pattern
        System.out.println("\nComposite Pattern:");
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        Directory dir1 = new Directory("Folder1");
        Directory dir2 = new Directory("Folder2");
        dir1.addComponent(file1);
        dir2.addComponent(file2);
        dir1.addComponent(dir2);
        dir1.showDetails();

        // Decorator Pattern
        System.out.println("\nDecorator Pattern:");
        TextEditor plainText = new SimpleText();
        TextEditor boldText = new BoldDecorator(plainText);
        TextEditor italicBoldText = new ItalicDecorator(boldText);
        System.out.println(plainText.write());
        System.out.println(boldText.write());
        System.out.println(italicBoldText.write());

        // Facade Pattern
        System.out.println("\nFacade Pattern:");
        BankFacade bankFacade = new BankFacade();
        bankFacade.performBankOperations();

        // Flyweight Pattern
        System.out.println("\nFlyweight Pattern:");
        String[] colors = {"Red", "Green", "Blue", "White", "Black"};
        for (int i = 0; i < 20; ++i) {
            Circle flyweightCircle = (Circle) ShapeFactory.getCircle(getRandomColor(colors));
            flyweightCircle.setX(getRandomX());
            flyweightCircle.setY(getRandomY());
            flyweightCircle.setRadius(100);
            flyweightCircle.draw();
        }

        // Proxy Pattern
        System.out.println("\nProxy Pattern:");
        BankAccountProxy authorizedProxy = new BankAccountProxy("authorizedUser");
        authorizedProxy.accessAccount();
        BankAccountProxy unauthorizedProxy = new BankAccountProxy("unauthorizedUser");
        unauthorizedProxy.accessAccount();
    }

    private static String getRandomColor(String[] colors) {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
