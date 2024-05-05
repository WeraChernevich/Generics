package ru.skillbox.notification_sender;

import ru.skillbox.notification.EmailNotification;
import ru.skillbox.notification_sender.NotificationSender;

import java.util.List;

public class EmailNotificationSender implements NotificationSender<EmailNotification> {
    @Override
    public void send(EmailNotification notification) {
        System.out.println("EMAIL");
        System.out.println("subject: " + notification.getSubject());
        System.out.println("receivers: " + String.join(", ", notification.getReceivers()));
        System.out.println("message: " + notification.formattedMessage("Спасибо за регистрацию на сервисе!"));
    }

    @Override
    public void send(List<EmailNotification> notifications) {
       for(EmailNotification notification : notifications) {
         send(notification);
       }
    }
}
