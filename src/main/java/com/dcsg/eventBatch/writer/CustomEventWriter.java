package com.dcsg.eventBatch.writer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import com.dcsg.eventBatch.dto.Event;

public class CustomEventWriter implements ItemWriter<Event> {
	private static final Logger log = LoggerFactory.getLogger(CustomEventWriter.class);

	@Override
	public void write(List<? extends Event> events) throws Exception {
		for (Event event : events) {
			
			log.debug("Writing the Event data, Id:: " + event.getId() +"   Short Title ::  " + event.getShort_title());
			
			

		}
	}

}
