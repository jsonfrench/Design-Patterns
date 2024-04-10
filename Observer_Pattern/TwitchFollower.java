package Observer_Pattern;

public class TwitchFollower implements Observer {
    Subject subject;    // In the future, we may want to store a list of subjects that the observer subscribes to.

    public TwitchFollower(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void receiveUpdate(Update update) {
        System.out.printf("Someone's Live on Twitch! - %s%n%s%n", update.dateTime, update.message);
    }
    
}
