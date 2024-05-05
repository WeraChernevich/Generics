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
public class EmailNotification implements Notification {
    private String subject;
    private List<String> receivers;

//    public EmailNotification(String subject, List<String> receivers) {
//        this.subject = subject;
//        this.receivers = new ArrayList<>(receivers);
//    }

//    public String getSubject() {
//        return subject;
//    }
//
//    public List<String> getReceivers() {
//        return receivers;
//    }

    @Override
    public String formattedMessage(String message) {
        return "<p>" + message + "</p>";
    }

}
