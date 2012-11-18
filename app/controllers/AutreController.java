package controllers;

import java.util.ArrayList;

import models.Entry;

import play.*;
import play.mvc.*;

import views.html.*;

public class AutreController extends Controller {
	
	public static Result exemple2() {
		return ok(test.render("Hello Word n°2 !"));
	}
	
	public static Result exemple3(String msg) {
		return ok(test.render(msg));
	}
	
	public static Result displayObject() {
		ArrayList<Entry> entries = new ArrayList<Entry>();
		Entry entry1 = new Entry();
		Entry entry2 = new Entry();
		entry2.head = "Second head";
		entry2.head2 = "Second body";
		entries.add(entry1);
		entries.add(entry2);
		return ok(
				objectRenderer.render(entries)
		);
	}

}
