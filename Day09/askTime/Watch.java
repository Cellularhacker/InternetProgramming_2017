//Watch.java 2017-05-16 KST
package askTime;

import java.util.Calendar;

public class Watch {
	public String watchTime(){
		Calendar c = Calendar.getInstance();
		int time = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		return "현재시간 : " + time + ":" + minute + ":" + second;
	}
}