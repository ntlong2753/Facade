public class Client {
    public void share(String mess) {
        MediaFacade mediaFacade = new MediaFacade(new Facebook(), new Twitter(), new LinkedIn());
        mediaFacade.MediaShare("abc");
    }
}
