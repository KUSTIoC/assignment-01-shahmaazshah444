public class Test{
	public static void main(String[] args){
	

		Paper paper1 = new Paper("OPP",1,"CS-213-1","Sir Ali Zaib","2nd","BSCS",new Date(18,3,2020)
		,new Time(9,0,0),"Final Term","Sir Sanaullah","Conference Room",50,false);

		Paper paper2 = new Paper("DLD",2,"CS-131-1","Sir Illyas","2nd","BSCS",new Date(19,3,2020)
		,new Time(1,30,0),"Final Term","Sir Sanaullah","Conference Room",70,false);

		Paper paper3 = new Paper("Principal of Management",3,"BS-121-1","Mam Raida Bathool","2nd","BSCS",
		new Date(20,3,2020),new Time(4,0,0),"Final Term","Sir Sanaullah","Conference Room",80,false);

		paper1.setIsCollected(false);
		paper2.setIsCollected(true);
		paper3.setIsCollected(false);

		Course course1 = new Course("Computer Science","CS-213-1","Spring 2020",paper1);
		Course course2 = new Course("Computer Science","CS-131-1","Spring 2020",paper2);
		Course course3 = new Course("Computer Science","BS-121-1","Spring 2020",paper3);


		
		Paper paper4 = new Paper("Discrete Math",4,"MATH-103-1","Mam Shomila Bathool","2nd","BSCS",new Date(23,3,2020)
		,new Time(9,0,0),"Final Term","Sir Sanaullah","Conference Room",75,false);

		Paper paper5 = new Paper("Islamic Studies",5,"RS-101-1","Sir ","2nd","BSCS",new Date(24,3,2020)
		,new Time(1,30,0),"Final Term","Sir Sanaullah","Conference Room",65,false);

		Paper paper6 = new Paper("Communication Skills",6,"ENG-253-1","Sir Nasar Khan","2nd","BSCS",
		new Date(25,3,2020),new Time(4,0,0),"Final Term","Sir Sanaullah","Conference Room",60,false);


		paper1.setIsCollected(true);
		paper2.setIsCollected(false);
		paper3.setIsCollected(true);


		Course course4 = new Course("Computer Science","MATH-103-1","Spring 2020",paper4);
		Course course5 = new Course("Computer Science","RS-101-1","Spring 2020",paper5);
		Course course6 = new Course("Computer Science","ENG-253-1","Spring 2020",paper6);



		System.out.println(course1);
		System.out.println(course2);
		System.out.println(course3);
		System.out.println(course4);
		System.out.println(course5);
		System.out.println(course6);
			

	}
}