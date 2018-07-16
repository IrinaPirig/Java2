package HomeWork2;

public class HomePage extends Page implements IChrome, IFireFox {

	HomePage() {
		this.title = "home title";
		this.url = "home_url";
		this.htmlContent = "home 2";
	}

	@Override
	public String getHtmlFF() {
		return this.htmlBuilder();
	}

	@Override
	public String getHtmlChrome() {
		return this.htmlBuilder();
	}

}
