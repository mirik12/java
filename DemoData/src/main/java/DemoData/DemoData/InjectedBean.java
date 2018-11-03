package DemoData.DemoData;

import org.springframework.stereotype.Service;

@Service
public class InjectedBean {
	private String msg = "I am injected Bean";

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "InjectedBean [msg=" + msg + "]";
	}

}
