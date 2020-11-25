/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */

import java.util.ArrayList;


public class MessagingService {
    private ArrayList<Message> chat;
    
    public MessagingService(){
        this.chat = new ArrayList<>();
    }
    
    public void add(Message message){
        String s = message.getContent();
        int i = s.length();
        if (i <= 280){
            chat.add(message);
        }
    }
    
    public ArrayList<Message> getMessages(){
        return chat;
    }
}
