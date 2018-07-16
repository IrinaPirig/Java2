package HomeWork2;

public class AboutPage1 extends Page implements IFireFox {

	AboutPage1() {
		this.title = "about title";
		this.url = "about_url_1";
		this.htmlContent = "aboout content 1";
	}

	@Override
	public String getHtmlFF() {
		return this.htmlBuilder();
	}
}
