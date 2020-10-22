/**
 * The AreaOfTriangle program implements an application that
 * simply displays the total area of a triangle.
 *
 * @author  Adam Nguyen
 * @since   2020-10-22 
 */

package myproject;

public class AreaOfTriangle {

	public static void main(String[] args) {
		double area = TriangleArea(4.23,7);
		System.out.println("Area of a Triangle");
		System.out.printf("%.3f", area);
	}
	
	/**
	 * Calculating the area of a triangle 
	 *
	 * @param  base	  Length of the base of a triangle
	 * @param  height Length of the height of a triangle
	 * 
	 * @return The total area of a triangle
	 */
	public static double TriangleArea(double base, double height) {
		return (base*height)/2; // Calculating the area of a triangle 
	} 
}
