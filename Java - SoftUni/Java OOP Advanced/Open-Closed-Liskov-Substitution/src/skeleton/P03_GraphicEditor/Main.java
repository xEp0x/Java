package skeleton.P03_GraphicEditor;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(shape);
        Shape rect = new Rectangle();
        editor.drawShape(rect);
        Shape square = new Square();
        editor.drawShape(square);
    }
}
