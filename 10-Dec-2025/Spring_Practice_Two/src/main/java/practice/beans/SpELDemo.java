package practice.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpELDemo {
	@Value("${SpELDemo.i}")
	private int i;

	@Value("#{T(java.lang.Math).pow(5,3)}")
	private double power;

	private List<String> string;
	
	@Override
	public String toString() {
		return "SpELDemo [i=" + i + ", power=" + power + "]";
	}

}
