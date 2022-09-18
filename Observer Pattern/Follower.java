public class Follower implements Observer {
    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    public void update(String status) {
        // send message to followers that Channel is live.
    }

    public String getFollowerName() {
        return followerName;
    }

    public void setFollowerName(String follwerName) {
        this.followerName = followerName;
    }

    public void play() {
        // play channel
    }

}
