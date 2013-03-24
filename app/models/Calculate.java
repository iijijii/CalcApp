package models;

import java.util.ArrayList;
import java.util.List;
import play.data.validation.Constraints.*;

import models.Calculator1;

public class Calculate {

	public String function;

	public static List<Calculate> function() {
		return new ArrayList<Calculate>();
	}

	public static void save(Calculate calc) {
	}
}
