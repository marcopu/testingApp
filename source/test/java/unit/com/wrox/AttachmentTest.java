package com.wrox;

import static org.junit.Assert.*;

import org.junit.Test;

public class AttachmentTest {

	@Test
	public void test3() {
		Attachment instance = new Attachment();
		String name = "One";
		instance.setName(name);
		assertEquals(instance.getName(), name);
	}

}
