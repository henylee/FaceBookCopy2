package kr.co.tjenit.facebookcopy.data;

import java.util.Calendar;

/**
 * Created by the on 2017-08-04.
 */

public class MessageData {

    public String userName;
    public String messageInput;
    public Calendar date;

    public MessageData() {
    }

    public MessageData(String userName, String messageInput, Calendar date) {
        this.userName = userName;
        this.messageInput = messageInput;
        this.date = date;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessageInput() {
        return messageInput;
    }

    public void setMessageInput(String messageInput) {
        this.messageInput = messageInput;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }
}
