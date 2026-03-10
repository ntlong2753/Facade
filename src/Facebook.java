public class Facebook implements Media{
    private String message;
    @Override
    public void setMess(String message){
        this.message = message;
    }
    @Override
    public void share() {
        System.out.println("Share to Facebook: " + this.message);
    }
}
