package p02_services;

public class CompositeNotificationService implements NotificationService {

    private boolean isActive;
    private NotificationService[] notificationServices;

    public CompositeNotificationService(boolean isActive, NotificationService... notificationServices) {
        this.notificationServices = notificationServices;
        this.isActive = isActive;
    }

    @Override
    public void sendNotification() {
        for (NotificationService notificationService : this.notificationServices) {
            if (notificationService.isActive()) {
                notificationService.sendNotification();
            }
        }
    }

    @Override
    public boolean isActive() {
        return this.isActive;
    }
}
