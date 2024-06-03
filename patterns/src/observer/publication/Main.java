package observer.publication;

public class Main {
    public static void main(String[] args) {


        WriterSubject writer = new WriterSubject();

        Reader1 reader1 = new Reader1(writer);
        Reader2 reader2 = new Reader2(writer);
        Reader2 reader3 = new Reader2(writer);

        writer.setText("new text");
        writer.removeObserver(reader3);


    }
}
