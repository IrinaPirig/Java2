package HomeWork2;

public class ForumPage1 extends Page implements IChrome {
	ForumPage1() {
		this.title = "forum title";
		this.url = "forum_url_1";
		this.htmlContent = "forum content 1";
	}

	@Override
	public String getHtmlChrome() {
		return this.htmlBuilder();
	}
}
