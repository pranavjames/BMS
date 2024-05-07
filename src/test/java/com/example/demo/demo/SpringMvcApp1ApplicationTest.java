package com.example.demo.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.cybage.demo.SpringMvcApp1Application;
import com.cybage.model.Book;
import com.cybage.model.Employee;

import org.junit.Before;

@SpringBootTest
public class SpringMvcApp1ApplicationTest {

	private SpringMvcApp1Application app;

@Before
public void setup() {
    app = new SpringMvcApp1Application();
}

	@Test
	public void testGetBooks() {
		List<Book> expectedBooks = Arrays.asList(
				new Book(10, "Java", 100),
				new Book(11, "Java", 102),
				new Book(12, "Java", 103),
				new Book(10, "Java", 108)
		);

		ResponseEntity<List<Book>> response = app.getBooks();
		List<Book> actualBooks = response.getBody();

		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(expectedBooks, actualBooks);
	}


}