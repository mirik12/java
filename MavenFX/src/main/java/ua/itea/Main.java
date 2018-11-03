package ua.itea;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {
		Gson gson=new Gson();
		String str="{\"name\":\"I am pudge\",\"level\":13}";
		Pudge pudge=gson.fromJson(str,Pudge.class);
				System.out.println(pudge);
		pudge.setName("zeus");
		System.out.println(gson.toJson(pudge));
		
	}

}
