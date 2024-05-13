package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclaass;
import utilities.Excelutils;
import pagepackage.Logindemo;
import pagepackage.SauceHomeandLogoutpage;
import pagepackage.SauceProductpage;
import pagepackage.Sauceinformationpage;

public class Logintestdemo extends Baseclaass {
	

	@Test(priority=1)
	public void verifyLoginWithValidCred() {
		Logindemo p1=new Logindemo(driver);
		String x1="C:\\Users\\neeth\\OneDrive\\Desktop\\Book2.xlsx";
		String Sheet="Sheet2";
		int rowCount=Excelutils.getRowCount(x1,Sheet);
		for(int i=1;i<=rowCount;i++) {
			String UserName=Excelutils.getcellValues(x1, Sheet, i, 0);
			System.out.println("username--"+UserName);
			String pwd=Excelutils.getcellValues(x1, Sheet, i, 1);
			System.out.println("password----"+pwd);
			p1.setvalues(UserName,pwd);
			p1.clickloginBtn();
			driver.navigate().refresh();
			
			
		}
		}
		@Test(priority=2)
		public void addtocarttest() throws Exception {
			SauceProductpage ob1=new SauceProductpage(driver);
			Thread.sleep(5000);
			ob1.addtocart();
			Thread.sleep(5000);
			
			ob1.cartclick();
			Thread.sleep(5000);
			ob1.clickcheckout();
		}
		@Test(priority=3)
		public void informationvaluestest() throws Exception {
			Sauceinformationpage ob2=new Sauceinformationpage(driver);
			ob2.information();
			Thread.sleep(5000);
			ob2.clickcontinue();
			Thread.sleep(5000);
			
		}
	    @Test(priority=4)
		public void logouttest() throws Exception {
			SauceHomeandLogoutpage ob3=new SauceHomeandLogoutpage(driver);
			ob3.backhome();
			Thread.sleep(5000);
			ob3.logout();
			Thread.sleep(5000);
			
		}

}
