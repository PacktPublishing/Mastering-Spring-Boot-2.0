package com.dineshonjava.accountservice.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.dineshonjava.accountservice.stream.NotificationStreams;

/**
 * 
 * @author Dinesh.Rajput
 *
 */
@EnableBinding(NotificationStreams.class)
public class StreamsConfig {

}
