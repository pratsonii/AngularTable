package com.table;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class User {

	@Value("Pratik")
	private String Name;
}
