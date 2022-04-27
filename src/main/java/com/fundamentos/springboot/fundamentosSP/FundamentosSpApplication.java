package com.fundamentos.springboot.fundamentosSP;

import com.fundamentos.springboot.fundamentosSP.bean.MyBean;
import com.fundamentos.springboot.fundamentosSP.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosSpApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;
	public FundamentosSpApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosSpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();

	}
}
