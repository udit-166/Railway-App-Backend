package com.railway.model;

import java.util.List;

public class RunningStatusInfo {
	
	private boolean success;       
	private int user_id;
	private String train_number;
	private String train_name;
	private boolean gps_unable;
	private String train_start_date;
	private String notification_date;
	private boolean at_src_dstn;
	private boolean at_src;
	private boolean at_dstn;
	private boolean is_run_day;
	private String source;
	private String destinations;
	private String run_days;
	private int journey_time;
	private String std;
	private String data_from;
	private int new_alert_id;
	private String new_alert_msg;
	private String diverted_stations;
	private int instance_alert;
	private int related_alert;
	private boolean late_update;
	private boolean is_ry_eta;
	private String update_time;
	private long distance_from_source;
	private long total_distance;
	private int avg_speed;
	private int si_no;
	private String current_station_code;
	private String current_station_name;
	private String status;
	private String eta;
	private String etd;
	private int delay;
	private int ahead_distance;
	private String ahead_distance_text;
	private String status_as_of;
	private int platform_number;
	private String cur_stn_sta;
	private String cur_stn_std;
	private int stoppage_number;
	private int a_day;
	private int status_as_of_min;
	private Object dfp_carousel;
	private List<UpcomingStation> upcoming_stations;
	private List<UpcomingStation> previous_stations;
	private List<CurrentLocationInfo> current_location_info;
	private double spent_time;
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getTrain_number() {
		return train_number;
	}
	public void setTrain_number(String train_number) {
		this.train_number = train_number;
	}
	public String getTrain_name() {
		return train_name;
	}
	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}
	public boolean isGps_unable() {
		return gps_unable;
	}
	public void setGps_unable(boolean gps_unable) {
		this.gps_unable = gps_unable;
	}
	public String getTrain_start_date() {
		return train_start_date;
	}
	public void setTrain_start_date(String train_start_date) {
		this.train_start_date = train_start_date;
	}
	public String getNotification_date() {
		return notification_date;
	}
	public void setNotification_date(String notification_date) {
		this.notification_date = notification_date;
	}
	public boolean isAt_src_dstn() {
		return at_src_dstn;
	}
	public void setAt_src_dstn(boolean at_src_dstn) {
		this.at_src_dstn = at_src_dstn;
	}
	public boolean isAt_src() {
		return at_src;
	}
	public void setAt_src(boolean at_src) {
		this.at_src = at_src;
	}
	public boolean isAt_dstn() {
		return at_dstn;
	}
	public void setAt_dstn(boolean at_dstn) {
		this.at_dstn = at_dstn;
	}
	public boolean isIs_run_day() {
		return is_run_day;
	}
	public void setIs_run_day(boolean is_run_day) {
		this.is_run_day = is_run_day;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestinations() {
		return destinations;
	}
	public void setDestinations(String destinations) {
		this.destinations = destinations;
	}
	public String getRun_days() {
		return run_days;
	}
	public void setRun_days(String run_days) {
		this.run_days = run_days;
	}
	public int getJourney_time() {
		return journey_time;
	}
	public void setJourney_time(int journey_time) {
		this.journey_time = journey_time;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public String getData_from() {
		return data_from;
	}
	public void setData_from(String data_from) {
		this.data_from = data_from;
	}
	public int getNew_alert_id() {
		return new_alert_id;
	}
	public void setNew_alert_id(int new_alert_id) {
		this.new_alert_id = new_alert_id;
	}
	public String getNew_alert_msg() {
		return new_alert_msg;
	}
	public void setNew_alert_msg(String new_alert_msg) {
		this.new_alert_msg = new_alert_msg;
	}
	public String getDiverted_stations() {
		return diverted_stations;
	}
	public void setDiverted_stations(String diverted_stations) {
		this.diverted_stations = diverted_stations;
	}
	public int getInstance_alert() {
		return instance_alert;
	}
	public void setInstance_alert(int instance_alert) {
		this.instance_alert = instance_alert;
	}
	public int getRelated_alert() {
		return related_alert;
	}
	public void setRelated_alert(int related_alert) {
		this.related_alert = related_alert;
	}
	public boolean isLate_update() {
		return late_update;
	}
	public void setLate_update(boolean late_update) {
		this.late_update = late_update;
	}
	public boolean isIs_ry_eta() {
		return is_ry_eta;
	}
	public void setIs_ry_eta(boolean is_ry_eta) {
		this.is_ry_eta = is_ry_eta;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	public long getDistance_from_source() {
		return distance_from_source;
	}
	public void setDistance_from_source(long distance_from_source) {
		this.distance_from_source = distance_from_source;
	}
	public long getTotal_distance() {
		return total_distance;
	}
	public void setTotal_distance(long total_distance) {
		this.total_distance = total_distance;
	}
	public int getAvg_speed() {
		return avg_speed;
	}
	public void setAvg_speed(int avg_speed) {
		this.avg_speed = avg_speed;
	}
	public int getSi_no() {
		return si_no;
	}
	public void setSi_no(int si_no) {
		this.si_no = si_no;
	}
	public String getCurrent_station_code() {
		return current_station_code;
	}
	public void setCurrent_station_code(String current_station_code) {
		this.current_station_code = current_station_code;
	}
	public String getCurrent_station_name() {
		return current_station_name;
	}
	public void setCurrent_station_name(String current_station_name) {
		this.current_station_name = current_station_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEta() {
		return eta;
	}
	public void setEta(String eta) {
		this.eta = eta;
	}
	public String getEtd() {
		return etd;
	}
	public void setEtd(String etd) {
		this.etd = etd;
	}
	public int getDelay() {
		return delay;
	}
	public void setDelay(int delay) {
		this.delay = delay;
	}
	public int getAhead_distance() {
		return ahead_distance;
	}
	public void setAhead_distance(int ahead_distance) {
		this.ahead_distance = ahead_distance;
	}
	public String getAhead_distance_text() {
		return ahead_distance_text;
	}
	public void setAhead_distance_text(String ahead_distance_text) {
		this.ahead_distance_text = ahead_distance_text;
	}
	public String getStatus_as_of() {
		return status_as_of;
	}
	public void setStatus_as_of(String status_as_of) {
		this.status_as_of = status_as_of;
	}
	public int getPlatform_number() {
		return platform_number;
	}
	public void setPlatform_number(int platform_number) {
		this.platform_number = platform_number;
	}
	public String getCur_stn_sta() {
		return cur_stn_sta;
	}
	public void setCur_stn_sta(String cur_stn_sta) {
		this.cur_stn_sta = cur_stn_sta;
	}
	public String getCur_stn_std() {
		return cur_stn_std;
	}
	public void setCur_stn_std(String cur_stn_std) {
		this.cur_stn_std = cur_stn_std;
	}
	public int getStoppage_number() {
		return stoppage_number;
	}
	public void setStoppage_number(int stoppage_number) {
		this.stoppage_number = stoppage_number;
	}
	public int getA_day() {
		return a_day;
	}
	public void setA_day(int a_day) {
		this.a_day = a_day;
	}
	public int getStatus_as_of_min() {
		return status_as_of_min;
	}
	public void setStatus_as_of_min(int status_as_of_min) {
		this.status_as_of_min = status_as_of_min;
	}
	public Object getDfp_carousel() {
		return dfp_carousel;
	}
	public void setDfp_carousel(Object dfp_carousel) {
		this.dfp_carousel = dfp_carousel;
	}
	public List<UpcomingStation> getUpcoming_stations() {
		return upcoming_stations;
	}
	public void setUpcoming_stations(List<UpcomingStation> upcoming_stations) {
		this.upcoming_stations = upcoming_stations;
	}
	public List<UpcomingStation> getPrevious_stations() {
		return previous_stations;
	}
	public void setPrevious_stations(List<UpcomingStation> previous_stations) {
		this.previous_stations = previous_stations;
	}
	public List<CurrentLocationInfo> getCurrent_location_info() {
		return current_location_info;
	}
	public void setCurrent_location_info(List<CurrentLocationInfo> current_location_info) {
		this.current_location_info = current_location_info;
	}
	public double getSpent_time() {
		return spent_time;
	}
	public void setSpent_time(double spent_time) {
		this.spent_time = spent_time;
	}
	public RunningStatusInfo(boolean success, int user_id, String train_number, String train_name, boolean gps_unable,
			String train_start_date, String notification_date, boolean at_src_dstn, boolean at_src, boolean at_dstn,
			boolean is_run_day, String source, String destinations, String run_days, int journey_time, String std,
			String data_from, int new_alert_id, String new_alert_msg, String diverted_stations, int instance_alert,
			int related_alert, boolean late_update, boolean is_ry_eta, String update_time, long distance_from_source,
			long total_distance, int avg_speed, int si_no, String current_station_code, String current_station_name,
			String status, String eta, String etd, int delay, int ahead_distance, String ahead_distance_text,
			String status_as_of, int platform_number, String cur_stn_sta, String cur_stn_std, int stoppage_number,
			int a_day, int status_as_of_min, Object dfp_carousel, List<UpcomingStation> upcoming_stations,
			List<UpcomingStation> previous_stations, List<CurrentLocationInfo> current_location_info,
			double spent_time) {
		super();
		this.success = success;
		this.user_id = user_id;
		this.train_number = train_number;
		this.train_name = train_name;
		this.gps_unable = gps_unable;
		this.train_start_date = train_start_date;
		this.notification_date = notification_date;
		this.at_src_dstn = at_src_dstn;
		this.at_src = at_src;
		this.at_dstn = at_dstn;
		this.is_run_day = is_run_day;
		this.source = source;
		this.destinations = destinations;
		this.run_days = run_days;
		this.journey_time = journey_time;
		this.std = std;
		this.data_from = data_from;
		this.new_alert_id = new_alert_id;
		this.new_alert_msg = new_alert_msg;
		this.diverted_stations = diverted_stations;
		this.instance_alert = instance_alert;
		this.related_alert = related_alert;
		this.late_update = late_update;
		this.is_ry_eta = is_ry_eta;
		this.update_time = update_time;
		this.distance_from_source = distance_from_source;
		this.total_distance = total_distance;
		this.avg_speed = avg_speed;
		this.si_no = si_no;
		this.current_station_code = current_station_code;
		this.current_station_name = current_station_name;
		this.status = status;
		this.eta = eta;
		this.etd = etd;
		this.delay = delay;
		this.ahead_distance = ahead_distance;
		this.ahead_distance_text = ahead_distance_text;
		this.status_as_of = status_as_of;
		this.platform_number = platform_number;
		this.cur_stn_sta = cur_stn_sta;
		this.cur_stn_std = cur_stn_std;
		this.stoppage_number = stoppage_number;
		this.a_day = a_day;
		this.status_as_of_min = status_as_of_min;
		this.dfp_carousel = dfp_carousel;
		this.upcoming_stations = upcoming_stations;
		this.previous_stations = previous_stations;
		this.current_location_info = current_location_info;
		this.spent_time = spent_time;
	}
	public RunningStatusInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RunningStatusInfo [success=" + success + ", user_id=" + user_id + ", train_number=" + train_number
				+ ", train_name=" + train_name + ", gps_unable=" + gps_unable + ", train_start_date=" + train_start_date
				+ ", notification_date=" + notification_date + ", at_src_dstn=" + at_src_dstn + ", at_src=" + at_src
				+ ", at_dstn=" + at_dstn + ", is_run_day=" + is_run_day + ", source=" + source + ", destinations="
				+ destinations + ", run_days=" + run_days + ", journey_time=" + journey_time + ", std=" + std
				+ ", data_from=" + data_from + ", new_alert_id=" + new_alert_id + ", new_alert_msg=" + new_alert_msg
				+ ", diverted_stations=" + diverted_stations + ", instance_alert=" + instance_alert + ", related_alert="
				+ related_alert + ", late_update=" + late_update + ", is_ry_eta=" + is_ry_eta + ", update_time="
				+ update_time + ", distance_from_source=" + distance_from_source + ", total_distance=" + total_distance
				+ ", avg_speed=" + avg_speed + ", si_no=" + si_no + ", current_station_code=" + current_station_code
				+ ", current_station_name=" + current_station_name + ", status=" + status + ", eta=" + eta + ", etd="
				+ etd + ", delay=" + delay + ", ahead_distance=" + ahead_distance + ", ahead_distance_text="
				+ ahead_distance_text + ", status_as_of=" + status_as_of + ", platform_number=" + platform_number
				+ ", cur_stn_sta=" + cur_stn_sta + ", cur_stn_std=" + cur_stn_std + ", stoppage_number="
				+ stoppage_number + ", a_day=" + a_day + ", status_as_of_min=" + status_as_of_min + ", dfp_carousel="
				+ dfp_carousel + ", upcoming_stations=" + upcoming_stations + ", previous_stations=" + previous_stations
				+ ", current_location_info=" + current_location_info + ", spent_time=" + spent_time + "]";
	}
	
	
}
