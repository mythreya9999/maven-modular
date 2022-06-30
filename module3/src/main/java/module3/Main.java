package module3;

import io.jitpack.Module1Util;
import io.jitpack.Module2Util;

public class Main {
	public static void main(String[] args) {
	Module1Util mu = new Module1Util();
 String result = mu.testmethod();
 System.out.println(result);
 
	Module2Util mu1 = new Module2Util();
	mu1.testmethod();
		
		}

}
