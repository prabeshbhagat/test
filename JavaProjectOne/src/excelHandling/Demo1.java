package excelHandling;

import org.apache.log4j.Logger;

public class Demo1 {

	public static void main(String[] args) {
		Logger logs=Logger.getLogger("devpinoyLogger");
		logs.debug("begining of the program");
		for(int i=0;i<5;i++){
			logs.debug("iteration-"+i);
		}
		logs.debug("ending of program");

	}

}
