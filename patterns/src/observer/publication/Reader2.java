package observer.publication;

public class Reader2 implements Observer{
    public Reader2(WriterSubject writerSubject) {
        writerSubject.registerObserver(this);
    }
    @Override
    public void update(String text) {
        System.out.println("Reader2 update value: " + text);
    }
}
