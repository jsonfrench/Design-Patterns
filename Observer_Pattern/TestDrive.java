package Observer_Pattern;

public class TestDrive {
    public static void main(String[] args) {
        
        Livestreamer ludwig = new Livestreamer(); // Not programming the interface here because it doesn't mix well with acdeptUpdate() 

        Observer plum = new TwitchFollower(ludwig);
        Observer vivo = new TwitchFollower(ludwig);
        Observer elena = new YoutubeFollower(ludwig);

        ludwig.acceptUpdate(new Update("Ludwig's Live!"));


    }
    
}
