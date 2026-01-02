public interface ViewerInterface {
    public int getNumberOfSeats();
    public void setNumberOfSeats(int numberOfSeats);
    public int getSnackQuantity();
    public void setSnackQuantity(int snackQuantity);
    public String getScreenType();
    public void setScreenType(String screenType);
    public String getWantsSnacks();
    public void setWantsSnacks(String wantsSnacks);
    public ScreenInterface[] getScreen();
    public void setScreen(ScreenInterface[] screen);


}
