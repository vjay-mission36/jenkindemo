package com.mission36.spring.integration;

import java.io.File;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.file.FileReadingMessageSource;
import org.springframework.integration.file.FileWritingMessageHandler;

@Configuration
@EnableIntegration
public class SpringIntegrationConfig {
	
	@Bean
	@InboundChannelAdapter(value = "inboundChannel", poller = @Poller(fixedDelay = "1000"))
	public FileReadingMessageSource getFileReadingMessagingSource() {
		FileReadingMessageSource fileReadingMsgSource = new FileReadingMessageSource();
		fileReadingMsgSource.setDirectory(new File("/Users/vijaysekhar/Desktop/space elavator"));
		return fileReadingMsgSource;
	}
	
	@Bean
	@ServiceActivator(inputChannel = "inboundChannel")
	public FileWritingMessageHandler getFileWritingMessageHandler() {
		FileWritingMessageHandler fileWrtHandler = new FileWritingMessageHandler(new File("/Users/vijaysekhar/Desktop/space elavator1"));
		fileWrtHandler.setAutoCreateDirectory(true);
		fileWrtHandler.setExpectReply(false);
		return fileWrtHandler;
	}
	
}
