package com.dcsg.eventBatch.dto;

import org.springframework.stereotype.Component;

@Component
public class Meta {
	public int total;
	public int took;
	public int page;
	public int per_page;
	public Object geolocation;
}
