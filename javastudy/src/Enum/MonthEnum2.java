package Enum;

import lombok.Getter;
import lombok.Setter;

public enum MonthEnum2 {
	January(31,"冬季"),February(28,"冬季"), march(31,"春季"),
	April(30,"春季"), may(31,"春季"),June(30,"夏天"),July(31,"夏天"),
	August(31,"夏季"),September(30,"秋季"), October(31,"秋季"), 
	November(30,"秋季"), December(31,"冬季");
	@Getter@Setter
	private int fate;
	@Getter@Setter
	private String  Season;
	private MonthEnum2(int fate, String season) {
		this.fate = fate;
		Season = season;
	}
	

}
