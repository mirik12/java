package DemoData;

import java.sql.SQLException;

import javax.sql.DataSource;

import com.mysql.jdbc.Statement;

public class MyCode {
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public void doSomething(){
		System.out.println("Do something!");
		Statement st;
		try{
		st = (Statement) dataSource.getConnection().createStatement();
		st.execute("INSERT INTO users (id,email) VALUES(10,'myMail')");
		} catch(SQLException e) { 
			System.out.println("error");
		}
	}
}
