package Poketmon;

public class item {
	public String name;

	
	public item(String name) {
		this.name=name;
	}
	public void UesdItem (String name, Pokemon p) 
	{
		if(name.equals("이상한사탕")) 
		{
			p.setLevel(p.level+1);
		}
		else if(name.equals("요상한사탕"))
		{
			if(((Math.random()*10000)%10) % 2==0) 
			{
				p.setLevel(p.level+2);
			}
			else 
			{
				p.setLevel(p.level-2);
			}
				
		}
	}
	
	
	

}
