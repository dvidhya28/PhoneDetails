package org.phone;

public class InternalStorage {
private void processorName() {
	
System.out.println("processor name is snapdragon");
}private void ramSize() {
	System.out.println("RAM size is 6GB");

}
public static void main(String[] args) {
	InternalStorage a= new InternalStorage();
	ExternalStorage b= new ExternalStorage();
	a.processorName();
	a.ramSize();
	b.size();
}
}
