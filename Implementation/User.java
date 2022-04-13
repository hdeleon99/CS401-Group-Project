
public class User
{
	private String userID;
	private String password;
	private boolean usingClient = false;
	private boolean supervisor = false;
	private Client client = null;
	
	public User(String userID, String password)
	{
		this.userID = userID;
		this.password = password;
		//If 1st character of "userID" == 'S' set "supervisor" = true
	}
	
	public boolean GetUsingClient() {return usingClient;}
	public void SetUsingClient(boolean usingClient) {this.usingClient = usingClient;}
	
	public boolean GetSupervisor() {return supervisor;}
	
	public Client GetClient() //Lazy singleton to make sure this "User" instance only uses 1 client software at a time
	{
		if (client == null) {client = new Client();}
		return client;
	}
	
}
