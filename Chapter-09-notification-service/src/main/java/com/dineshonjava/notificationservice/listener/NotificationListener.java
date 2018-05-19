package com.dineshonjava.notificationservice.listener;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.dineshonjava.notificationservice.model.Notification;
import com.dineshonjava.notificationservice.stream.NotificationStreams;


@Component
public class NotificationListener {

	@StreamListener(NotificationStreams.INPUT)
	public void sendMailNotification(@Payload Notification notification) {
		System.out.println("Sent notification to email: "+notification.getEmail()+" Message: "+notification.getMessage());
	}
	
	@StreamListener(NotificationStreams.INPUT)
	public void sendSMSNotification(@Payload Notification notification) {
		System.out.println("Notified with SMS to mobile: "+notification.getMobile()+" Message: "+notification.getMessage());
	}
}
