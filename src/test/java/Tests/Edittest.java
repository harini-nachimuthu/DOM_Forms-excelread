package Tests;

import org.testng.annotations.Test;
import Pages.Editpage;

public class Edittest extends formfilling_Tests {

	@Test
    public void edit() throws InterruptedException {
		Editpage edittest1 = new Editpage(driver);
    	edittest1.namechange();
    	edittest1.citychange();
    	edittest1.salarychange();
    	edittest1.namechange1();
    	
    }
}
