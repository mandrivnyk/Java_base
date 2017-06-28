package Lesson_0_8;

public class PowerSupply {
	int v;
	int outputV1;
	int outputV2;
	boolean state;
	
	void usePowerSupply(int v){		
		outputV1 = 0;
		outputV2 = 0;
		state = false;	
		
		if(v>=200 && v<=250 ){
			outputV1 = 5;
			outputV2 = 12;
			state = true;
		}	
	}
	
	void getInfo(int v){
		System.out.println("v1: "+outputV1+" v2: "+outputV2+" state: "+(state? "on": "off")+
				((v<200 && v>0)?" High voltage":"")+((v>250)?" Low voltage":""));
	}
}
