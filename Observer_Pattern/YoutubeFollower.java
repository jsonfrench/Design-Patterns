package Observer_Pattern;

public class YoutubeFollower implements Observer{
    Subject subject; 
    
    public YoutubeFollower(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void receiveUpdate(Update update) {
        System.out.printf("New Notification: %n%s%n", update.message);
    }
}

