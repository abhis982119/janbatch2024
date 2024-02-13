package org.pbatch.oops.abstraction;

public class EmailService {

    public static void  send(String recipient, String body, String subject){
        System.out.println("mail sent to " + recipient + " with subject " + subject + " content : " + body );
    }
}
