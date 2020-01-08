
public class Grade11th extends Grade{
	
	public Grade11th() {
		super();
		database_path = absolute_path + "/databases/grade11.json";
	}
	
	public void setVariant(int number) {
		super.setVariant(number);
	}
	
	public String getTask(int number) {
		return super.getTask(number);
	}

}
