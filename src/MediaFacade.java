public class MediaFacade {
    private Facebook facebook;
    private Twitter twitter;
    private LinkedIn linkedIn;

    public MediaFacade(Facebook _facebook, Twitter _twitter, LinkedIn _linkedIn) {
        this.facebook = _facebook;
        this.twitter = _twitter;
        this.linkedIn = _linkedIn;
    }

    public void MediaShare(String shareMessage) {
        this.facebook.setMess(shareMessage);
        this.twitter.setMess(shareMessage);
        this.linkedIn.setMess(shareMessage);
        this.facebook.share();
        this.twitter.share();
        this.linkedIn.share();
    }
}
