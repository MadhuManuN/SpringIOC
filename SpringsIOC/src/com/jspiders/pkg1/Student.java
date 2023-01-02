package com.jspiders.pkg1;

public class Student {

//	private MathCheat mathCheat;//dependency
	
//	private ScienceCheat scienceCheat;
	
	//To support all kind of objects(Math,Science or anyClass) we use interface
	private Cheat cheat;
	
	

//	public void setScienceCheat(ScienceCheat scienceCheat) {
//		this.scienceCheat = scienceCheat;
//	}

//	public void setMathCheat(MathCheat mathCheat) 
//	{
//		this.mathCheat = mathCheat;
//	}
	
	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}



	public void cheating()
	{
//		mathCheat.mathCheat();
//		scienceCheat.scienceCheat();
		cheat.cheat();
	}
	
}
