package models.layouts;

import abstractClasses.Layout;
import models.Message;


public class XmlLayout implements Layout {
    @Override
    public String formatMessage(Message message) {
        return String.format("<log>%n   <date>%s</date>%n   <level>%s</level>%n   <message>%s</message>%n</log>",
                message.getDate(), message.getReportLevel(), message.getText());
    }
}
