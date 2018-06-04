package com.dineshonjava.notificationservice.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.dineshonjava.notificationservice.stream.NotificationStreams;

/**
 * 
 * @author Dinesh.Rajput
 *
 */
@EnableBinding(NotificationStreams.class)
public class StreamsConfig {

}
