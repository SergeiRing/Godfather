
public class Grade9th extends Grade{
	
	public Grade9th() {
		super();
		database_path = absolute_path + "/databases/grade9.json";
	}
	
	public void setVariant(int number) {
		super.setVariant(number);
	}
	
	public String getTask(int number) {
		return super.getTask(number);
	}

}
