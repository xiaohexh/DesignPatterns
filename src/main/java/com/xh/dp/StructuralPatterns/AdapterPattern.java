package com.xh.dp.StructuralPatterns;

class Adaptee {
	public void specificRequest() {
		System.out.println("Adaptee specific request");
	}
}

interface Target {
	void request();
}

class ConcreteTarget implements Target {
	public void request() {
		System.out.println("concrete can handle concrete request");
	}
}
// class adapter
//class Adapter extends Adaptee implements Target {
//	public void request() {
//		super.specificRequest();
//	}
//}

// object adapter
class Adapter implements Target {
	
	private Adaptee adaptee = new Adaptee();
	
	public void request() {
		adaptee.specificRequest();
	}
}

public abstract class AdapterPattern {
	public static void main(String[] args) {
		Target ct = new ConcreteTarget();
		ct.request();
		
		Target at = new Adapter();
		at.request();
	}
}
