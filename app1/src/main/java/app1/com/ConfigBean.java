package app1.com;

import org.springframework.context.annotation.Configuration;

@Configuration
@MyMapperScan(value = "ConfigBean")
public class ConfigBean {
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	String a;
	String b;
}