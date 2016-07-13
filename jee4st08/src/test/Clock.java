package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {
	public String now(){
		return new SimpleDateFormat("HH:mm:ss").format(new Date());
	}
}
