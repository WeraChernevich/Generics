package ru.skillbox.notification_sender;

import ru.skillbox.notification.PushNotification;
import ru.skillbox.notification_sender.NotificationSender;

import java.util.List;

public class PushNotificationSender implements NotificationSender<PushNotification> {
    @Override
    public void send(PushNotification notification) {
        System.out.println( System.lineSeparator() + "PUSH");
        System.out.println("title: " + notification.getTitle());
        System.out.println("receiver: " + String.join(", ", notification.getReceivers()));
        System.out.println("message: " + notification.formattedMessage("Спасибо за регистрацию на сервисе!"));
    }

    @Override
    public void send(List<PushNotification> notifications) {
        for (PushNotification p : notifications) {
            send(p);
        }
    }
}
