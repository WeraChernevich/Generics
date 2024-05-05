package ru.skillbox;

import ru.skillbox.notification.EmailNotification;
import ru.skillbox.notification.PushNotification;
import ru.skillbox.notification.SmsNotification;
import ru.skillbox.notification_sender.EmailNotificationSender;
import ru.skillbox.notification_sender.PushNotificationSender;
import ru.skillbox.notification_sender.SmsNotificationSender;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmailNotificationSender sender = new EmailNotificationSender();
        List<EmailNotification> notifications = new ArrayList<>();

        EmailNotification notification = new EmailNotification("Успешная регистрация!",
                List.of("oleg@java.skillbox.ru", "masha@java.skillbox.ru", "yan@java.skillbox.ru"));
        notifications.add(notification);
        sender.send(notifications);

        SmsNotificationSender sender1 = new SmsNotificationSender();
        List<SmsNotification> notifications1 = new ArrayList<>();

        SmsNotification notification1 = new SmsNotification(List.of("+70001234567"));
        notifications1.add(notification1);
        sender1.send(notifications1);

        PushNotificationSender sender2 = new PushNotificationSender();
        List<PushNotification> notifications2 = new ArrayList<>();

        PushNotification notification2 = new PushNotification("Успешная регистрация!", List.of("o.yanovich"));
        notifications2.add(notification2);
        sender2.send(notifications2);

    }
}
