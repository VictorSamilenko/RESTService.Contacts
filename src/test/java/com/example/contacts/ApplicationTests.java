package com.example.contacts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationTests {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void contextLoads() {
		assertEquals(this.testRestTemplate.getForEntity("/contacts?nameFilter=^a",String.class).getStatusCodeValue(),200);
		assertEquals(this.testRestTemplate.getForEntity("/contacts?nameFilter=*",String.class).getStatusCodeValue(), 400);
	}
}
