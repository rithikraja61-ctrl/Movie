public interface ScreenInterface {
    public int getTotalBill();
    public void setTotalBill(int totalBill);
    public int getSnackPrice();
    public void setSnackPrice(int snackPrice);
    public int getTicketPrice();
    public void setTicketPrice(int ticketPrice);
    public String getBookingId();
    public void setBookingId(String bookingId);
    void calculateTicketPrice();
    void calculateSnacksPrice();
    void generateBill();
    void applyDiscount();
    public ViewerInterface getViewer();
    public void setViewer(ViewerInterface viewer);


}
