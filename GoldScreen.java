public class GoldScreen extends Screen {

    GoldScreen(int ticketPrice, int snackPrice, int totalBill, String bookingId) {
        this.setTicketPrice(ticketPrice);
        this.setSnackPrice(snackPrice);
        this.setTotalBill(totalBill);
        this.setBookingId(bookingId);
    }

    GoldScreen() {

    }

}
