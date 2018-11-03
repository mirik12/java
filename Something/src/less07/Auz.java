package less07;

public class Auz {
	private boolean ok=false;
	private String login;
	public boolean isOk() {
		return login.equals("admin")?true:false;
	}
	public void setOk(boolean ok) {
		this.ok = ok;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	
}
