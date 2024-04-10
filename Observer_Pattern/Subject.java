package Observer_Pattern;

public interface Subject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void sendUpdate(Update update);
}
