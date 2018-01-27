package ufo.codility.lessons.lesson_1.iterations;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class BinaryGap {

    public int solution(int value) {
    	int N = value;
    	int temp = 0;
    	int max = 0;

    	boolean firstOneFound = false;

        do {
        	if ((N&1)==0) {
        		if (firstOneFound) {
        			temp++;
        		}
        	} else {
        		max = Math.max(max, temp);
        		temp = 0;
        		firstOneFound = true;
        	}
        }
        while ((N>>=1) != 0) ;

        return max;
    }

}