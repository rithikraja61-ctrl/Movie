public abstract class Screen implements ScreenInterface{
    private int ticketPrice, snackPrice, totalBill;//known
    private String bookingId;//known
    private ViewerInterface viewer;
    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    public int getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(int snackPrice) {
        this.snackPrice = snackPrice;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public void calculateTicketPrice() {
        this.ticketPrice = viewer.getNumberOfSeats() * this.ticketPrice;
        System.out.println("Ticket Price :");
        System.out.println(this.ticketPrice);

    }

    public void calculateSnacksPrice() {

        if (viewer.getWantsSnacks().equals("YES")) {
            this.snackPrice = viewer.getSnackQuantity() * this.snackPrice;
            System.out.println("Snack Price :");
            System.out.println(this.snackPrice);
        } else {
            this.snackPrice = 0;
            System.out.println("Snack Price :");
            System.out.println(this.snackPrice);
        }

    }

    public void generateBill() {
        this.totalBill = ticketPrice + snackPrice + this.totalBill;
        System.out.println("TOTAL BILL:");
        System.out.println(this.totalBill);
    }

    public void applyDiscount() {
        double discount;
        if (viewer.getNumberOfSeats() >= 4) {
            discount = this.totalBill * 0.1;
            this.totalBill = this.totalBill - (int) discount;
        }
        else{
            discount=0;
        }
        System.out.println("Discount Applied :");
        System.out.println(discount);
        System.out.println("Finial Bill :");
        System.out.println(this.totalBill);

    }

    public ViewerInterface getViewer() {
        return viewer;
    }

    public void setViewer(ViewerInterface viewer) {
        this.viewer = viewer;
    }
}
