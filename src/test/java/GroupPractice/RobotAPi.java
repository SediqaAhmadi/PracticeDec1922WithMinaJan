package GroupPractice;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class RobotAPi {

	public static void main(String[] args) {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain,application/pdf");
		profile.setPreference("browser.download.manager.ShowWhenStarting", false);
		profile.setPreference("pdfjs.disabled", true);  //this line is only for pdf
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		
		

	}

}
