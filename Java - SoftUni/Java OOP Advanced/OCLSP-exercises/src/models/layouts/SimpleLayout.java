package models.layouts;

import abstractClasses.Layout;
import models.Message;


public class SimpleLayout implements Layout {
    @Override
    public String formatMessage(Message message) {
        return String.format("%s - %s - %s", message.getDate(), message.getReportLevel().name(), message.getText());
    }
}
