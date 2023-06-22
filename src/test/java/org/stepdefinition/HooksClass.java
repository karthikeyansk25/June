package org.stepdefinition;

import org.sample.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	@Before
	public void precondition() {
		launchchrome();
		winMax();
	}
	@After
	public void postcondition() {
		close();
	}

}
