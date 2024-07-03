package equalsmethod;

public class car {
	String car_name;
	int car_price;
	String car_color;
	private int price;
	
	car(String car_name,int car_price,String car_color)
	{
		this.car_name=car_name;
		this.car_price=car_price;
		this.car_color=car_color;
	}
	
	public boolean equals(Object obj)
	{
		car car2=(car)obj;
		return this.car_price==car2.car_price;
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car car1=new car("hondai",245555,"red");
		//car car2=new car("bugati",7889998,"yellow");
		car car2=car1;
		System.out.println(car1.equals(car2));

	}

}
