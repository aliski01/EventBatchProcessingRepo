package com.dcsg.eventBatch.dto;

import java.util.ArrayList;
import java.util.Date;


public class Event {
	private String type;
    private int id;
    private Date datetime_utc;
    private Venue venue;
    private boolean datetime_tbd;
    private ArrayList<Performer> performers;
    private boolean is_open;
    private ArrayList<Object> links;
    private Date datetime_local;
    private boolean time_tbd;
    private String short_title;
    private Date visible_until_utc;
    private Stats stats;
    private ArrayList<Taxonomy> taxonomies;
    private String url;
    private double score;
    private Date announce_date;
    private Date created_at;
    private boolean date_tbd;
    private String title;
    private double popularity;
    private String description;
    private String status;
    private Object access_method;
    private Object event_promotion;
    private Announcements announcements;
    private boolean conditional;
    private Object enddatetime_utc;
    private ArrayList<Object> themes;
    private ArrayList<Object> domain_information;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDatetime_utc() {
		return datetime_utc;
	}
	public void setDatetime_utc(Date datetime_utc) {
		this.datetime_utc = datetime_utc;
	}
	public Venue getVenue() {
		return venue;
	}
	public void setVenue(Venue venue) {
		this.venue = venue;
	}
	public boolean isDatetime_tbd() {
		return datetime_tbd;
	}
	public void setDatetime_tbd(boolean datetime_tbd) {
		this.datetime_tbd = datetime_tbd;
	}
	public ArrayList<Performer> getPerformers() {
		return performers;
	}
	public void setPerformers(ArrayList<Performer> performers) {
		this.performers = performers;
	}
	public boolean isIs_open() {
		return is_open;
	}
	public void setIs_open(boolean is_open) {
		this.is_open = is_open;
	}
	public ArrayList<Object> getLinks() {
		return links;
	}
	public void setLinks(ArrayList<Object> links) {
		this.links = links;
	}
	public Date getDatetime_local() {
		return datetime_local;
	}
	public void setDatetime_local(Date datetime_local) {
		this.datetime_local = datetime_local;
	}
	public boolean isTime_tbd() {
		return time_tbd;
	}
	public void setTime_tbd(boolean time_tbd) {
		this.time_tbd = time_tbd;
	}
	public String getShort_title() {
		return short_title;
	}
	public void setShort_title(String short_title) {
		this.short_title = short_title;
	}
	public Date getVisible_until_utc() {
		return visible_until_utc;
	}
	public void setVisible_until_utc(Date visible_until_utc) {
		this.visible_until_utc = visible_until_utc;
	}
	public Stats getStats() {
		return stats;
	}
	public void setStats(Stats stats) {
		this.stats = stats;
	}
	public ArrayList<Taxonomy> getTaxonomies() {
		return taxonomies;
	}
	public void setTaxonomies(ArrayList<Taxonomy> taxonomies) {
		this.taxonomies = taxonomies;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Date getAnnounce_date() {
		return announce_date;
	}
	public void setAnnounce_date(Date announce_date) {
		this.announce_date = announce_date;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public boolean isDate_tbd() {
		return date_tbd;
	}
	public void setDate_tbd(boolean date_tbd) {
		this.date_tbd = date_tbd;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPopularity() {
		return popularity;
	}
	public void setPopularity(double popularity) {
		this.popularity = popularity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getAccess_method() {
		return access_method;
	}
	public void setAccess_method(Object access_method) {
		this.access_method = access_method;
	}
	public Object getEvent_promotion() {
		return event_promotion;
	}
	public void setEvent_promotion(Object event_promotion) {
		this.event_promotion = event_promotion;
	}
	public Announcements getAnnouncements() {
		return announcements;
	}
	public void setAnnouncements(Announcements announcements) {
		this.announcements = announcements;
	}
	public boolean isConditional() {
		return conditional;
	}
	public void setConditional(boolean conditional) {
		this.conditional = conditional;
	}
	public Object getEnddatetime_utc() {
		return enddatetime_utc;
	}
	public void setEnddatetime_utc(Object enddatetime_utc) {
		this.enddatetime_utc = enddatetime_utc;
	}
	public ArrayList<Object> getThemes() {
		return themes;
	}
	public void setThemes(ArrayList<Object> themes) {
		this.themes = themes;
	}
	public ArrayList<Object> getDomain_information() {
		return domain_information;
	}
	public void setDomain_information(ArrayList<Object> domain_information) {
		this.domain_information = domain_information;
	}
    
}
