package mavenproject;

public class callingwrappermethods {
		public static void main(String[]args) {
			wrapperMethods wM =new wrapperMethods();
			wM.insertapp("https://www.facebook.com");
			wM.enterbyname("email", "8328386774");
			wM.enterbyname("pass","Justin3670");
			wM.clickbyid("u_0_r");
			//wM.screenshot("./test.png");
			wM.closeapp();
		}

	}


