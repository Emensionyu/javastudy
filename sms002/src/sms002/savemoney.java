package sms002;

public class savemoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double daymoney=2.5;
		double sum=0;
		int count=0;
		while(true) {
			sum+=daymoney;
			count++;
			if(count%5==0) {
				sum-=6;
			}
			if(sum>100) {
				System.out.println("要经过"+count+"天才存完100块钱");
				return;
			}
		}

	}

}
