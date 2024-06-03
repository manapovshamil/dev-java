package observer.publication;

public class Reader1 implements Observer {

    public Reader1(WriterSubject writerSubject) {
        writerSubject.registerObserver(this);
    }

    @Override
    public void update(String text) {
        System.out.println("Reader1 update value: " + text);
    }
}
