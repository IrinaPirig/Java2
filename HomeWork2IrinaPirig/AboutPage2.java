package HomeWork2;

public class AboutPage2 extends Page implements IFireFox {

	AboutPage2() {
		this.title = "about title";
		this.url = "about_url_2";
		this.htmlContent = "aboout content 2";
	}

	@Override
	public String getHtmlFF() {
		return this.htmlBuilder();
	}
}
