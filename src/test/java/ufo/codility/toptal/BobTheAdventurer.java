/*******************************************************************************
 * Copyright 2018 Francesco Cina'
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package ufo.codility.toptal;


public class BobTheAdventurer {

	public static class Point2D {
		public int x;
		public int y;

		public Point2D(int x, int y) {
			this.x = x;
			this.y = y;

		}
	}

    public int solution(Point2D[] A) {

    	final int max = A.length;
    	int alligned = 0;

        for (int i = 0; i < max; i++) {
        	for ( int j = i+1; j<max; j++ ) {
        		if (alligned(A[i], A[j])) {
        			alligned++;
        		}
        	}
		}

        return max-alligned;
    }

    public boolean alligned(Point2D a, Point2D b) {
    	if (sameSide(a, b)) {
    		return a.x/b.x == a.y/b.y;
    	}
    	return false;
    }

    public boolean sameSide(Point2D a, Point2D b) {
    	return a.x*b.x>0 && a.y*b.y>0;
    }

}
