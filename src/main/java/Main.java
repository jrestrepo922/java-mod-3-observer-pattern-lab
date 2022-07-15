import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // your code here
        System.out.println("Managing Hotel");

        // create hotel email and notification services
        HotelEmailService emailService = new HotelEmailService();
        HotelPushNotificationService notificationService = new HotelPushNotificationService();

        HotelFloor hotelFloor1 = new HotelFloor();
        HotelRoom hotelRoom11 = new HotelRoom();
        HotelRoom hotelRoom12 = new HotelRoom();
        HotelRoom hotelRoom13 = new HotelRoom();
        HotelRoom hotelRoom14 = new HotelRoom();
        HotelRoom hotelRoom15 = new HotelRoom();
        hotelFloor1.addHotelRoom(hotelRoom11);
        hotelFloor1.addHotelRoom(hotelRoom12);
        hotelFloor1.addHotelRoom(hotelRoom13);
        hotelFloor1.addHotelRoom(hotelRoom14);
        hotelFloor1.addHotelRoom(hotelRoom15);
        hotelFloor1.getHotelRooms().addCheckingObserver(emailService);
        hotelFloor1.getHotelRooms().addCheckingObserver(notificationService);


        HotelFloor hotelFloor2 = new HotelFloor();
        HotelRoom hotelRoom21 = new HotelRoom();
        HotelRoom hotelRoom22 = new HotelRoom();
        HotelRoom hotelRoom23 = new HotelRoom();
        HotelRoom hotelRoom24 = new HotelRoom();
        HotelRoom hotelRoom25 = new HotelRoom();
        hotelFloor2.addHotelRoom(hotelRoom21);
        hotelFloor2.addHotelRoom(hotelRoom22);
        hotelFloor2.addHotelRoom(hotelRoom23);
        hotelFloor2.addHotelRoom(hotelRoom24);
        hotelFloor2.addHotelRoom(hotelRoom25);
        hotelFloor2.getHotelRooms().addCheckingObserver(emailService);
        hotelFloor2.getHotelRooms().addCheckingObserver(notificationService);

        HotelFloor hotelFloor3 = new HotelFloor();
        HotelRoom hotelRoom31 = new HotelRoom();
        HotelRoom hotelRoom32 = new HotelRoom();
        HotelRoom hotelRoom33 = new HotelRoom();
        HotelRoom hotelRoom34 = new HotelRoom();
        HotelRoom hotelRoom35 = new HotelRoom();
        hotelFloor3.addHotelRoom(hotelRoom31);
        hotelFloor3.addHotelRoom(hotelRoom32);
        hotelFloor3.addHotelRoom(hotelRoom33);
        hotelFloor3.addHotelRoom(hotelRoom34);
        hotelFloor3.addHotelRoom(hotelRoom35);
        hotelFloor3.getHotelRooms().addCheckingObserver(emailService);
        hotelFloor3.getHotelRooms().addCheckingObserver(notificationService);




    }
}
