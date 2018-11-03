package less07;

public class Config {
	private String adress;
	private String login;
	private String password;
	@Override
	public String toString() {
		return "Config [adress=" + adress + ", login=" + login + ", password=" + password + "]";
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
