package com.xgeek.main;

import com.xgeek.bolt.test.ChildClass;
import com.xgeek.bolt.test.MyThread;

public class PracticeTest {

	public static void main(String[] args) {
		
		MyThread parent = new ChildClass();
		
		parent.doExecute();
	}

}
