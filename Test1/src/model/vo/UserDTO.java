package model.vo;

public class UserDTO {
	
	int user_No;
	String user_Id;
	String user_Name;
	int user_Age;
	
	public UserDTO() {}

	public UserDTO(int user_No, String user_Id, String user_Name, int user_Age) {
		super();
		this.user_No = user_No;
		this.user_Id = user_Id;
		this.user_Name = user_Name;
		this.user_Age = user_Age;
	}

	public int getUser_No() {
		return user_No;
	}

	public void setUser_No(int user_No) {
		this.user_No = user_No;
	}

	public String getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public int getUser_Age() {
		return user_Age;
	}

	public void setUser_Age(int user_Age) {
		this.user_Age = user_Age;
	}

	@Override
	public String toString() {
		return "UserDTO [user_No=" + user_No + ", user_Id=" + user_Id + ", user_Name=" + user_Name + ", user_Age="
				+ user_Age + "]";
	}
	
}
