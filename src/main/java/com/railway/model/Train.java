package com.railway.model;

import java.util.List;

public class Train {
	private String train_number;
	private String train_name;
	private List<String> run_days;
	private String train_src;
	private String train_dstn;
	private String from_std;
	private String from_sta;
	private String local_train_from_sta;
	private String to_sta;
	private String to_std;
	private int from_day;
	private int to_day;
	private int d_day;
	private String from;
	private String to;
	private String from_station_name;
	private int halt_stn;
	private long distance;
	private String to_station_name;
	private String duration;
	private boolean special_train;
	private String train_type;
	private int score;
	private int score_train_type;
	private int score_booking_requency;
	private int frequency_prec;
	private String from_distance_text;
	private String to_distance_text;
	private boolean has_pantry;
	private boolean is_mansoon_timing_applicable;
	private int duration_rating;
	private int score_duration;
	private int score_std;
	private int score_user_preference;
	private String train_date;
	private String eng_train_name;
	public String getEng_train_name() {
		return eng_train_name;
	}
	public void setEng_train_name(String eng_train_name) {
		this.eng_train_name = eng_train_name;
	}
	private List<String> class_type;
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
	public List<String> getRun_days() {
		return run_days;
	}
	public void setRun_days(List<String> run_days) {
		this.run_days = run_days;
	}
	public String getTrain_src() {
		return train_src;
	}
	public void setTrain_src(String train_src) {
		this.train_src = train_src;
	}
	public String getTrain_dstn() {
		return train_dstn;
	}
	public void setTrain_dstn(String train_dstn) {
		this.train_dstn = train_dstn;
	}
	public String getFrom_std() {
		return from_std;
	}
	public void setFrom_std(String from_std) {
		this.from_std = from_std;
	}
	public String getFrom_sta() {
		return from_sta;
	}
	public void setFrom_sta(String from_sta) {
		this.from_sta = from_sta;
	}
	public String getLocal_train_from_sta() {
		return local_train_from_sta;
	}
	public void setLocal_train_from_sta(String local_train_from_sta) {
		this.local_train_from_sta = local_train_from_sta;
	}
	public String getTo_sta() {
		return to_sta;
	}
	public void setTo_sta(String to_sta) {
		this.to_sta = to_sta;
	}
	public String getTo_std() {
		return to_std;
	}
	public void setTo_std(String to_std) {
		this.to_std = to_std;
	}
	public int getFrom_day() {
		return from_day;
	}
	public void setFrom_day(int from_day) {
		this.from_day = from_day;
	}
	public int getTo_day() {
		return to_day;
	}
	public void setTo_day(int to_day) {
		this.to_day = to_day;
	}
	public int getD_day() {
		return d_day;
	}
	public void setD_day(int d_day) {
		this.d_day = d_day;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom_station_name() {
		return from_station_name;
	}
	public void setFrom_station_name(String from_station_name) {
		this.from_station_name = from_station_name;
	}
	public int getHalt_stn() {
		return halt_stn;
	}
	public void setHalt_stn(int halt_stn) {
		this.halt_stn = halt_stn;
	}
	public long getDistance() {
		return distance;
	}
	public void setDistance(long distance) {
		this.distance = distance;
	}
	public String getTo_station_name() {
		return to_station_name;
	}
	public void setTo_station_name(String to_station_name) {
		this.to_station_name = to_station_name;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public boolean isSpecial_train() {
		return special_train;
	}
	public void setSpecial_train(boolean special_train) {
		this.special_train = special_train;
	}
	public String getTrain_type() {
		return train_type;
	}
	public void setTrain_type(String train_type) {
		this.train_type = train_type;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore_train_type() {
		return score_train_type;
	}
	public void setScore_train_type(int score_train_type) {
		this.score_train_type = score_train_type;
	}
	public int getScore_booking_requency() {
		return score_booking_requency;
	}
	public void setScore_booking_requency(int score_booking_requency) {
		this.score_booking_requency = score_booking_requency;
	}
	public int getFrequency_prec() {
		return frequency_prec;
	}
	public void setFrequency_prec(int frequency_prec) {
		this.frequency_prec = frequency_prec;
	}
	public String getFrom_distance_text() {
		return from_distance_text;
	}
	public void setFrom_distance_text(String from_distance_text) {
		this.from_distance_text = from_distance_text;
	}
	public String getTo_distance_text() {
		return to_distance_text;
	}
	public void setTo_distance_text(String to_distance_text) {
		this.to_distance_text = to_distance_text;
	}
	public boolean isHas_pantry() {
		return has_pantry;
	}
	public void setHas_pantry(boolean has_pantry) {
		this.has_pantry = has_pantry;
	}
	public boolean isIs_mansoon_timing_applicable() {
		return is_mansoon_timing_applicable;
	}
	public void setIs_mansoon_timing_applicable(boolean is_mansoon_timing_applicable) {
		this.is_mansoon_timing_applicable = is_mansoon_timing_applicable;
	}
	public int getDuration_rating() {
		return duration_rating;
	}
	public void setDuration_rating(int duration_rating) {
		this.duration_rating = duration_rating;
	}
	public int getScore_duration() {
		return score_duration;
	}
	public void setScore_duration(int score_duration) {
		this.score_duration = score_duration;
	}
	public int getScore_std() {
		return score_std;
	}
	public void setScore_std(int score_std) {
		this.score_std = score_std;
	}
	public int getScore_user_preference() {
		return score_user_preference;
	}
	public void setScore_user_preference(int score_user_preference) {
		this.score_user_preference = score_user_preference;
	}
	public String getTrain_date() {
		return train_date;
	}
	public void setTrain_date(String train_date) {
		this.train_date = train_date;
	}
	public List<String> getClass_type() {
		return class_type;
	}
	public void setClass_type(List<String> class_type) {
		this.class_type = class_type;
	}
	public Train(String train_number, String train_name, List<String> run_days, String train_src, String train_dstn,
			String from_std, String from_sta, String local_train_from_sta, String to_sta, String to_std, int from_day,
			int to_day, int d_day, String from, String to, String from_station_name, int halt_stn, long distance,
			String to_station_name, String duration, boolean special_train, String train_type, int score,
			int score_train_type, int score_booking_requency, int frequency_prec, String from_distance_text,
			String to_distance_text, boolean has_pantry, boolean is_mansoon_timing_applicable, int duration_rating,
			int score_duration, int score_std, int score_user_preference, String train_date, List<String> class_type) {
		super();
		this.train_number = train_number;
		this.train_name = train_name;
		this.run_days = run_days;
		this.train_src = train_src;
		this.train_dstn = train_dstn;
		this.from_std = from_std;
		this.from_sta = from_sta;
		this.local_train_from_sta = local_train_from_sta;
		this.to_sta = to_sta;
		this.to_std = to_std;
		this.from_day = from_day;
		this.to_day = to_day;
		this.d_day = d_day;
		this.from = from;
		this.to = to;
		this.from_station_name = from_station_name;
		this.halt_stn = halt_stn;
		this.distance = distance;
		this.to_station_name = to_station_name;
		this.duration = duration;
		this.special_train = special_train;
		this.train_type = train_type;
		this.score = score;
		this.score_train_type = score_train_type;
		this.score_booking_requency = score_booking_requency;
		this.frequency_prec = frequency_prec;
		this.from_distance_text = from_distance_text;
		this.to_distance_text = to_distance_text;
		this.has_pantry = has_pantry;
		this.is_mansoon_timing_applicable = is_mansoon_timing_applicable;
		this.duration_rating = duration_rating;
		this.score_duration = score_duration;
		this.score_std = score_std;
		this.score_user_preference = score_user_preference;
		this.train_date = train_date;
		this.class_type = class_type;
	}
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Train [train_number=" + train_number + ", train_name=" + train_name + ", run_days=" + run_days
				+ ", train_src=" + train_src + ", train_dstn=" + train_dstn + ", from_std=" + from_std + ", from_sta="
				+ from_sta + ", local_train_from_sta=" + local_train_from_sta + ", to_sta=" + to_sta + ", to_std="
				+ to_std + ", from_day=" + from_day + ", to_day=" + to_day + ", d_day=" + d_day + ", from=" + from
				+ ", to=" + to + ", from_station_name=" + from_station_name + ", halt_stn=" + halt_stn + ", distance="
				+ distance + ", to_station_name=" + to_station_name + ", duration=" + duration + ", special_train="
				+ special_train + ", train_type=" + train_type + ", score=" + score + ", score_train_type="
				+ score_train_type + ", score_booking_requency=" + score_booking_requency + ", frequency_prec="
				+ frequency_prec + ", from_distance_text=" + from_distance_text + ", to_distance_text="
				+ to_distance_text + ", has_pantry=" + has_pantry + ", is_mansoon_timing_applicable="
				+ is_mansoon_timing_applicable + ", duration_rating=" + duration_rating + ", score_duration="
				+ score_duration + ", score_std=" + score_std + ", score_user_preference=" + score_user_preference
				+ ", train_date=" + train_date + ", class_type=" + class_type + "]";
	}
	
	
}
