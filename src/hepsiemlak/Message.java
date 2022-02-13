package hepsiemlak;

import java.util.Date;


public class Message {
    
    public static int messageCount = 0;

    
    // Primary Key - Auto Generated ID
    private int messageId = messageCount;
    private int senderId;
    private int receiverId;
    private String title;
    private String content;
    private Date creationDate;
    private Date seenDate;
    private boolean wasSeen = false;

    public Message(int senderId, int receiverId, String title, String content) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.title = title;
        this.content = content;
    }

    public static int getMessageCount() {
        return messageCount;
    }

    public static void setMessageCount(int messageCount) {
        Message.messageCount = messageCount;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getSeenDate() {
        return seenDate;
    }

    public void setSeenDate(Date seenDate) {
        this.seenDate = seenDate;
    }

    public boolean isWasSeen() {
        return wasSeen;
    }

    public void setWasSeen(boolean wasSeen) {
        this.wasSeen = wasSeen;
    }
    
    
    
    
    

    
}
