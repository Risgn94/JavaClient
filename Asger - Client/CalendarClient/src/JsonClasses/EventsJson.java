package JsonClasses;
public class EventsJson implements java.io.Serializable{

	private  final long serialVersionUID = 2L;
	private String overallID = "createEvent";
	private String eventid ;
	private String cbsEventId = "Custom";
	private String type;
	private String locationName;
	private String createdBy;
	private String startYear;
	private String startMonth;
	private String startDay;
	private String startHour;
	private String startMinute;
	public String getStartYear() {
		return startYear;
	}
	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}
	public String getStartMonth() {
		return startMonth;
	}
	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}
	public String getStartDay() {
		return startDay;
	}
	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}
	public String getStartHour() {
		return startHour;
	}
	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}
	public String getStartMinute() {
		return startMinute;
	}
	public void setStartMinute(String startMinute) {
		this.startMinute = startMinute;
	}
	public String getEndYear() {
		return endYear;
	}
	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}
	public String getEndMonth() {
		return endMonth;
	}
	public void setEndMonth(String endMonth) {
		this.endMonth = endMonth;
	}
	public String getEndDay() {
		return endDay;
	}
	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}
	public String getEndHour() {
		return endHour;
	}
	public void setEndHour(String endHour) {
		this.endHour = endHour;
	}
	public String getEndMinute() {
		return endMinute;
	}
	public void setEndMinute(String endMinute) {
		this.endMinute = endMinute;
	}
	private String endYear;
	private String endMonth;
	private String endDay;
	private String endHour;
	private String endMinute;
	private String name;
	private String text;
	private String customevent;
	private String CalendarID;
	
	public String getOverallID() {
		return overallID;
	}
	public void setOverallID(String overallID) {
		this.overallID = overallID;
	}
	public String getEventid() {
		return eventid;
	}
	public void setEventid(String eventid) {
		this.eventid = eventid;
	}
	public String getCbsEventId() {
		return cbsEventId;
	}
	public void setCbsEventId(String cbsEventId) {
		this.cbsEventId = cbsEventId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getStart() {
		return startYear;
	}
	public void setStart(String start) {
		this.startYear = start;
	}
	public String getEnd() {
		return endYear;
	}
	public void setEnd(String end) {
		this.endYear = end;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getCustomevent() {
		return customevent;
	}
	public void setCustomevent(String customevent) {
		this.customevent = customevent;
	}
	public String getCalendarID() {
		return CalendarID;
	}
	public void setCalendarID(String calendarID) {
		CalendarID = calendarID;
	}
	public long getSerialVersionUID() {
		return serialVersionUID;
	}
}
