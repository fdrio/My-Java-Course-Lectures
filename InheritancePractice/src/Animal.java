
public abstract class Animal {
	private String name;
	private String group;
	public void setName(String name){
		this.name = name ;
	}
	public String getName(){
		return (this.name);
	}
	public void setGroup(String group){
		this.group = group;
	}
	
	public String getGroup(){
		return this.group;
	}
	public abstract void sound (String noise);
	
}
