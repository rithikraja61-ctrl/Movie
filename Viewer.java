public class Viewer implements ViewerInterface {
   private int numberOfSeats,snackQuantity;// known
   private String screenType,wantsSnacks;//known
   private ScreenInterface[] screen=new ScreenInterface[2];

    public Viewer(int numberOfSeats,String screenType,String wantsSnacks,int snackQuantity)
{
    this.numberOfSeats=numberOfSeats;
    this.screenType=screenType;
    this.wantsSnacks=wantsSnacks;
    this.snackQuantity=snackQuantity;

}
public Viewer()
{

}
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getSnackQuantity() {
        return snackQuantity;
    }

    public void setSnackQuantity(int snackQuantity) {
        this.snackQuantity = snackQuantity;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getWantsSnacks() {
        return wantsSnacks;
    }

    public void setWantsSnacks(String wantsSnacks) {
        this.wantsSnacks = wantsSnacks;
    }

    public ScreenInterface[] getScreen() {
        return screen;
    }

    public void setScreen(ScreenInterface[] screen) {
        this.screen = screen;
    }
}
