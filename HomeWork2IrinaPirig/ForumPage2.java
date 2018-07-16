package HomeWork2;

public class ForumPage2 extends Page implements IChrome {
	ForumPage2() {
		this.title = "forum title";
		this.url = "forum_url_2";
		this.htmlContent = "forum content 2";
	}

	@Override
	public String getHtmlChrome() {
		return this.htmlBuilder();
	}
}