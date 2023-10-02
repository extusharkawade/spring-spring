package com.example.building;

import com.example.building.controller.Home;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BuildingApplicationTests {

	@Test
	void firstTest(){
		Home home= new Home();
		String maintenance =home.first();
		assertEquals (maintenance,"This site is under maintenance");
	}

}
