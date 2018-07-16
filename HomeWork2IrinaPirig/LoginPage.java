package HomeWork2;

public class LoginPage extends Page implements IChrome, IFireFox {
	LoginPage() {
		this.title = "login title";
		this.url = "login_url";
		this.htmlContent = "login content";
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