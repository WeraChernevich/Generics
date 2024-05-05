package ru.skillbox.notification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.skillbox.notification.Notification;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
public class SmsNotification implements Notification {
    private List<String> receivers;

    @Override
    public String formattedMessage(String message) {

        return message;
    }
}
