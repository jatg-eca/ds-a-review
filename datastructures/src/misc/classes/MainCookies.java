package misc.classes;

public class MainCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cookie cookieOne = new Cookie("green");
		Cookie cookieTwo = new Cookie("blue");
		
		cookieOne.setColor("brown");
		
		System.out.println(cookieOne.getColor());
		System.out.println(cookieTwo.getColor());

	}

}
