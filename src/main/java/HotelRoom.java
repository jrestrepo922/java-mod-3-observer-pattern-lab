import java.util.ArrayList;
import java.util.List;

public class HotelRoom implements HotelRoomInterface {
    private List<RoomCheckinObserver> checkinObservers = new ArrayList<RoomCheckinObserver>();

    @Override
    public void book(String guestName) {
        System.out.println("Booked a room for " + guestName);
    }

    @Override
    public void clean() {
        System.out.println("Cleaned Room");
    }


    public void addCheckinObserver(RoomCheckinObserver checkinObserver) {
        checkinObservers.add(checkinObserver);
    }

    public void removeCheckinObserver(RoomCheckinObserver checkinObserver) {
        checkinObservers.remove(checkinObserver);
    }

    public void checkIn(String guestName) {
        System.out.println(guestName + "checked in");
        checkinObservers.forEach((checkinObserver -> checkinObserver.update(guestName)));
    }
}
