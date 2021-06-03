
import java.util.TreeSet;
import java.util.Collections;
import java.util.Iterator;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t = new TreeSet<String>();
		t.add("L");
		t.add("M");
		t.add("N");
t.add("H");
		t.add("B");
		t.add("R");
		t.add("O");
		t.add("P");
		t.add("Q");
		System.out.println(t);
		System.out.println(t.descendingSet());
		//System.out.println(t.higher("O"));
		//System.out.println(t.higher("N"));
		Iterator i=t.iterator();
		//[1,2,3,4]
		while(i.hasNext()) {
//			if(i.next()!="Q") {
//				System.out.println(i.toString());
//			}
			
			String temp=i.next().toString();
			if(temp!="Q") {
				System.out.println(temp);
			}
		}
		
		//System.out.println(Collections.reverse(t.toArray()));
		System.out.println("jenkins Executed successfully-1");
		System.out.println("jenkins Executed successfully-2");
		System.out.println("jenkins Executed successfully-3");
		System.out.println("jenkins Executed successfully-4");
		System.out.println("jenkins Executed successfully-5");
		System.out.println("Line has been added from bitbuket-6");
		
		
		
	}

}
