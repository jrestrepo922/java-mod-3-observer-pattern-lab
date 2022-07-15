import java.util.ArrayList;
import java.util.List;

public class HotelFloor implements HotelRoomInterface{
    private List<HotelRoomInterface> hotelRooms = new ArrayList<HotelRoomInterface>();

    @Override
    public void book(String guestName) {
        hotelRooms.forEach(child -> child.book(guestName));
    }

    @Override
    public void clean() {
        hotelRooms.forEach(child -> child.clean());
    }

    public void addHotelRoom(HotelRoomInterface hotelRoom){
        this.hotelRooms.add(hotelRoom);
    }

    public void removeHotelRoom(HotelRoomInterface hotelRoom){
        this.hotelRooms.remove(hotelRoom);
    }


    public List<HotelRoomInterface> getHotelRooms() {
        return hotelRooms;
    }
}
