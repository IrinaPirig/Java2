package HomeWork2;

public abstract class Page {

	public String title;
	public String url;
	public String htmlContent;

	public Page load() {
		return this;
	}

	public Page refresh() {
		return load();
	}

	public String htmlBuilder() {
		return htmlContent;
	}

	public String getTitle() {
		return title;
	}
}