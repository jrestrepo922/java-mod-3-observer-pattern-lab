public class HotelEmailService implements RoomCheckinObserver{
    @Override
    public void update(Object guestName) {
        System.out.println("Send email update to " + guestName);
    }
}
