package ru.skillbox.notification_sender;

import ru.skillbox.notification.SmsNotification;
import ru.skillbox.notification_sender.NotificationSender;

import java.util.List;

public class SmsNotificationSender implements NotificationSender<SmsNotification> {
    @Override
    public void send(SmsNotification notification) {
        System.out.println(System.lineSeparator() + "SMS");
        System.out.println("receivers: " + String.join(", ", notification.getReceivers()));
        System.out.println("message: " + notification.formattedMessage("Спасибо за регистрацию на сервисе!"));
    }

    @Override
    public void send(List<SmsNotification> notifications) {
        for(SmsNotification s : notifications) {
            send(s);
        }
    }
}
