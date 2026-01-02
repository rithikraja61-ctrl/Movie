/*
Today problem statement!!
🎬 *Assignment: Movie Ticket Booking System*

*3 Entities:* Viewer, GoldScreen, SilverScreen

─────────────────
*VERSION 1: Basic*
─────────────────

*Viewer*
• Knows: (from INPUT via Scanner)
  - numberOfSeats
  - screenType (GOLD / SILVER)
  - wantsSnacks (YES / NO)
  - snackQuantity
• Unknown: bookingId, ticketPrice, snackPrice, totalBill
• Default Constructor (empty)

*GoldScreen & SilverScreen*
• Knows: bookingId, ticketPrice, snackPrice, totalBill (Constructor with params)
• Unknown: numberOfSeats, wantsSnacks, snackQuantity
• Default Constructor (empty)

─────────────────
*Methods (Complex):*
─────────────────

*Method 1: calculateTicketPrice()*
  - No params (gets numberOfSeats from viewer reference)
  - Modifies ticketPrice
  - Logic:
    • Gold: ticketPrice = numberOfSeats * 500
    • Silver: ticketPrice = numberOfSeats * 200
  - Prints "Ticket Price: " + ticketPrice

*Method 2: calculateSnackPrice()*
  - No params (gets wantsSnacks, snackQuantity from viewer reference)
  - Modifies snackPrice
  - Logic:
    • If wantsSnacks == "YES"
      → Gold: snackPrice = snackQuantity * 150 (premium snacks)
      → Silver: snackPrice = snackQuantity * 80 (regular snacks)
    • If wantsSnacks == "NO"
      → snackPrice = 0
  - Prints "Snack Price: " + snackPrice

*Method 3: generateBill()*
  - No params
  - Modifies totalBill
  - Logic:
    • Gold: totalBill = ticketPrice + snackPrice + 100 (convenience fee)
    • Silver: totalBill = ticketPrice + snackPrice + 50 (convenience fee)
  - Prints "Total Bill: " + totalBill

*Method 4: applyDiscount()*
  - No params
  - Modifies totalBill
  - Logic:
    • If numberOfSeats >= 4 → Apply 10% discount
    • Else → No discount
  - Prints "Discount Applied: " + discountAmount

─────────────────
*Main Logic (Complex):*
─────────────────

// ===== VIEWER 1 =====
Viewer1 → Create Empty Viewer
→ Take numberOfSeats from INPUT
→ Take screenType from INPUT
→ Take wantsSnacks from INPUT
→ If wantsSnacks == "YES" → Take snackQuantity from INPUT
→ set all values
if (viewer1 is GOLD)
Create Known GoldScreen with viewer1 reference
share address of goldScreen to viewer1
perform calculateTicketPrice()
perform calculateSnackPrice()
perform generateBill()
perform applyDiscount()
print "===== BOOKING SUMMARY ====="
print viewer1.getGoldScreen().getBookingId()
print viewer1.getGoldScreen().getTicketPrice()
print viewer1.getGoldScreen().getSnackPrice()
print viewer1.getGoldScreen().getTotalBill()
if (viewer1 is SILVER)
Create Known SilverScreen with viewer1 reference
share address of silverScreen to viewer1
perform calculateTicketPrice()
perform calculateSnackPrice()
perform generateBill()
perform applyDiscount()
print "===== BOOKING SUMMARY ====="
print viewer1.getSilverScreen().getBookingId()
print viewer1.getSilverScreen().getTicketPrice()
print viewer1.getSilverScreen().getSnackPrice()
print viewer1.getSilverScreen().getTotalBill()
// ===== VIEWER 2 =====
(Same logic for viewer2)
// ===== COMPARISON =====
if (viewer1.getTotalBill() > viewer2.getTotalBill())
print "Viewer 1 paid more!"
else if (viewer2.getTotalBill() > viewer1.getTotalBill())
print "Viewer 2 paid more!"
else
print "Both paid same amount!"


─────────────────
*VERSION 2: Association*
─────────────────

*Viewer Changes:*
• Remove: bookingId, ticketPrice, snackPrice, totalBill
• Add: goldScreen variable (getter/setter)
• Add: silverScreen variable (getter/setter)

*GoldScreen Changes:*
• Remove: numberOfSeats, wantsSnacks, snackQuantity
• Add: viewer variable (getter/setter)
• Access values via: viewer.getNumberOfSeats(), viewer.getWantsSnacks()

*SilverScreen Changes:*
• Remove: numberOfSeats, wantsSnacks, snackQuantity
• Add: viewer variable (getter/setter)
• Access values via: viewer.getNumberOfSeats(), viewer.getWantsSnacks()

─────────────────
*Expected Input:*
─────────────────

===== VIEWER 1 =====
Enter number of seats:
5
Enter screen type (GOLD/SILVER):
Gold
Want snacks? (YES/NO):
YES
Enter snack quantity:
3
===== VIEWER 2 =====
Enter number of seats:
2
Enter screen type (GOLD/SILVER):
Silver
Want snacks? (YES/NO):
NO


─────────────────
*Expected Output:*
─────────────────
===== VIEWER 1: GOLD =====
Ticket Price: 2500
Snack Price: 450
Total Bill: 3050
Discount Applied: 305
Final Bill: 2745
BookingId: G101
===== VIEWER 2: SILVER =====
Ticket Price: 400
Snack Price: 0
Total Bill: 450
Discount Applied: 0
Final Bill: 450
BookingId: S202
===== COMPARISON =====
Viewer 1 paid more!

 */
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        BigInteger snackQuantity,snackQuantity1;
        ViewerInterface v1=new Viewer();
        Scanner sc=new Scanner(System.in);
        System.out.println("=====VIEWER 1====");
        System.out.println("Enter number of seats :");
        BigInteger numberOfSeats1=new BigInteger(sc.nextLine());
        v1.setNumberOfSeats(numberOfSeats1.intValue());
        System.out.println("Enter Screen Type(GOLD/SILVER)");
        String screen1=sc.nextLine();
        v1.setScreenType(screen1);
        System.out.println("Want snacks?(YES/NO)");
        String snack1=sc.nextLine();
        v1.setWantsSnacks(snack1);
        if(snack1.equals("YES"))
        {
            System.out.println("Enter snack quantity :");
            snackQuantity=new BigInteger(sc.nextLine());
        }
        else
        {
            snackQuantity=new BigInteger("0");
        }
        v1.setSnackQuantity(snackQuantity.intValue());
        System.out.println("=====VIEWER 2====");
        System.out.println("Enter number of seats :");
        BigInteger numberOfSeats2=new BigInteger(sc.nextLine());
        System.out.println("Enter Screen Type(GOLD/SILVER)");
        String screen2=sc.nextLine();
        System.out.println("Want snacks?(YES/NO)");
        String snack2=sc.nextLine();
        if(snack2.equals("YES"))
        {
            System.out.println("Enter snack quantity :");
            snackQuantity1=new BigInteger(sc.nextLine());
        }
        else
        {
            snackQuantity1=new BigInteger("0");
        }
        ViewerInterface v2=new Viewer(numberOfSeats2.intValue(),screen2,snack2,snackQuantity.intValue());

    if(v1.getScreenType().equals("GOLD"))
    {
        System.out.println("====VIEWER 1 GOLD ====");
        ScreenInterface g=new GoldScreen(500,150,100,"G100");
        ScreenInterface[] arr=v1.getScreen();
        arr[1]=g;
        g.setViewer(v1);
        g.calculateTicketPrice();
        g.calculateSnacksPrice();
        g.generateBill();
        g.applyDiscount();
       // System.out.println("====BOOKING SUMMARY====");
        //System.out.println(arr[1].getBookingId());
        //System.out.println(arr[1].getTicketPrice());
        //System.out.println(arr[1].getSnackPrice());
        //System.out.println(arr[1].getTotalBill());
    }
        else
        {
            ScreenInterface s=new SilverScreen(500,150,100,"G100");
            System.out.println("====VIEWER 1 SILVER ====");
            ScreenInterface[] arr=v1.getScreen();
            arr[1]=s;
            s.setViewer(v1);
            s.calculateTicketPrice();
            s.calculateSnacksPrice();
            s.generateBill();
            s.applyDiscount();
          //  System.out.println("====BOOKING SUMMARY====");
           // System.out.println(arr[1].getBookingId());
            //System.out.println(arr[1].getTicketPrice());
            //System.out.println(arr[1].getSnackPrice());
            //System.out.println(arr[1].getTotalBill());
        }
        if(v2.getScreenType().equals("GOLD"))
        {
            System.out.println("====VIEWER 2 GOLD ====");
            ScreenInterface g=new GoldScreen(500,150,100,"G100");
            ScreenInterface[] arr=v2.getScreen();
            arr[1]=g;
            g.setViewer(v2);
            g.calculateTicketPrice();
            g.calculateSnacksPrice();
            g.generateBill();
            g.applyDiscount();
            //System.out.println("====BOOKING SUMMARY====");
            //System.out.println(arr[1].getBookingId());
            //System.out.println(arr[1].getTicketPrice());
            //System.out.println(arr[1].getSnackPrice());
           // System.out.println(arr[1].getTotalBill());
        }
        else
        {
            System.out.println("====VIEWER 2 SILVER ====");
            ScreenInterface s=new SilverScreen(500,150,100,"G100");
            ScreenInterface[] arr=v2.getScreen();
            arr[1]=s;
            s.setViewer(v2);
            s.calculateTicketPrice();
            s.calculateSnacksPrice();
            s.generateBill();
            s.applyDiscount();
          //  System.out.println("====BOOKING SUMMARY====");
           // System.out.println(arr[1].getBookingId());
           // System.out.println(arr[1].getTicketPrice());
            //System.out.println(arr[1].getSnackPrice());
           // System.out.println(arr[1].getTotalBill());
        }
        System.out.println("====COMPARISON====");
        ScreenInterface[] d1=v1.getScreen();
        ScreenInterface[] d2=v2.getScreen();
        if(d1[1].getTotalBill()>d2[1].getTotalBill())
        {
            System.out.println("Viewer 1 Paid More");
        }
        else if(d1[1].getTotalBill()<d2[1].getTotalBill()) {
            System.out.println("Viewer 2 Paid More");

        }
       else {
            System.out.println("Both Paid Equal");

        }
    }
    }
