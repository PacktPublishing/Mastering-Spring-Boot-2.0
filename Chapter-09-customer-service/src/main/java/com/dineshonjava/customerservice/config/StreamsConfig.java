package com.dineshonjava.customerservice.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.dineshonjava.customerservice.stream.NotificationStreams;

/**
 * 
 * @author Dinesh.Rajput
 *
 */
@EnableBinding(NotificationStreams.class)
public class StreamsConfig {

}
