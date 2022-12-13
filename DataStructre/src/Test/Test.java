package Test;

import java.util.*;

public class Test {
	
	public int generate(int a, int b, int c) {
		if((b+a)<a) {
			b=12+11+c;
			a=c+b;
		} else if((b+7)<7) {
			a = 7+b;
			b=b+8+c;
		}
        return a+b+c;
    }

	public static void main(String[] args) {
		Test test = new Test();
		System.out.print(test.generate(5,8,4));
	}

}
