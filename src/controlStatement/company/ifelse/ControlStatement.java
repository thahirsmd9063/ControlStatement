package controlStatement.company.ifelse;

public class ControlStatement {
	public static void main(String []args) {
		System.out.println("welcome control system");
		int value7 = 250;
		int value8 = 250; 
		if(value7 >=value8) {
			System.out.println("value7");
		}
		else {
			System.out.println("value8");
		}
		int value9 = 100 ;
		switch(value9) {
		case 20: System.out.println("20");
		break;
		case 30 :System.out.println("30");
		break;
		case 40 :System.out.println("40");
		break;
		default :System.out.println("no value match");
		}
		for(int i=1; i<=75; i++) {
			System.out.println(i+" ");
		}
		int i=1;
		while( i<=80){
			System.out.println(i);
			i++;
		}
		
	}

}
