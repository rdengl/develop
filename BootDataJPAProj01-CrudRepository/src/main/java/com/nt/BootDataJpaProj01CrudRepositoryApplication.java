package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.entity.CoronaVaccine;
import com.nt.service.ICoronaVaccineMgmtService;

@SpringBootApplication
public class BootDataJpaProj01CrudRepositoryApplication {
//checking for test
	public static void main(String[] args) {
			ApplicationContext ctx=SpringApplication.run(BootDataJpaProj01CrudRepositoryApplication.class, args);
				/*	//get Service class obj
		//===================//===============
		//added new change for now
		//===================//===============
		//aded by Ram from git
		ApplicationContext ctx=SpringApplication.run(BootDataJpaProj01CrudRepositoryApplication.class, args);
		//added from Git repository
		/*	//get Service class obj
			ICoronaVaccineMgmtService  service=ctx.getBean("vaccineMgmtService",ICoronaVaccineMgmtService.class);
			 //invoke methods
			try {
			   	//create Entity class obj
				//CoronaVaccine vaccine=new CoronaVaccine(null,"covaxin","Bharat-BioTech","india",234.0,3);
				CoronaVaccine vaccine=new CoronaVaccine("covishield","Serum","india",500.0,2);
				//call b.method
				System.out.println(service.registerVaccine(vaccine));
			}
			catch(DataAccessException dae) {
			System.out.println("printing stack");
				dae.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			((ConfigurableApplicationContext) ctx).close();*/
	}

}
