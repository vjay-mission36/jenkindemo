package com.mission36.dir2dir.configuration;

import java.io.File;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.file.FileReadingMessageSource;
import org.springframework.integration.file.FileWritingMessageHandler;
import org.springframework.integration.file.filters.SimplePatternFileListFilter;
import org.springframework.integration.file.support.FileExistsMode;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;

@Configuration
@EnableIntegration
public class BasicIntegrationConfig {
	
	public final String INPUT_DIR = "/tmp/input/";
	public final String OUTPUT_DIR ="/tmp/output/";
	public final String FILE_PATTERN = "*.txt";
	
	
	@Bean
	public MessageChannel fileChannel() {
		return new DirectChannel();
	}
	
	@Bean
	@InboundChannelAdapter(value = "fileChannel", poller = @Poller(fixedDelay = "1000"))
	public MessageSource<File> fileReadingMessageSource(){
		FileReadingMessageSource fileReadingMsgSource = new FileReadingMessageSource();
		fileReadingMsgSource.setDirectory(new File(INPUT_DIR));
		fileReadingMsgSource.setFilter(new SimplePatternFileListFilter(FILE_PATTERN));
		return fileReadingMsgSource;
	}
	
	
	@Bean
	@ServiceActivator(inputChannel = "fileChannel")
	public MessageHandler fileWrittingMessageHandler() {
		FileWritingMessageHandler fileOPHandler = new FileWritingMessageHandler(new File("OUTPUT_DIR"));
		fileOPHandler.setFileExistsMode(FileExistsMode.REPLACE);
		fileOPHandler.setExpectReply(false);
		return fileOPHandler;
	}
	
   
    

}
