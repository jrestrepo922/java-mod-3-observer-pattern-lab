public class HotelPushNotificationService implements RoomCheckinObserver{
    @Override
    public void update(Object guestName) {
        System.out.println("Registered " + guestName + " for push notification updates");
    }
}
