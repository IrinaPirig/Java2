package HomeWork2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import java.util.HashMap;

public class PageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AboutPage1 aboutPage1 = new AboutPage1();
		AboutPage2 aboutPage2 = new AboutPage2();

		ForumPage1 forumPage1 = new ForumPage1();
		ForumPage2 forumPage2 = new ForumPage2();

		HomePage homePage = new HomePage();

		LoginPage loginPage = new LoginPage();

		List<Page> pageCollection = new ArrayList<>();
		List<Page> pageChromeCollection = new ArrayList<>();
		List<Page> pageFFCollection = new ArrayList<>();

		pageCollection.add(forumPage1);
		pageCollection.add(forumPage2);
		pageCollection.add(aboutPage1);
		pageCollection.add(aboutPage2);
		pageCollection.add(homePage);
		pageCollection.add(loginPage);

		System.out.println("All Pages:" + pageCollection);

		for (Page page : pageCollection) {
			if (page instanceof IFireFox) {
				pageFFCollection.add(page);
			}
			if (page instanceof IChrome) {
				pageChromeCollection.add(page);
			}
		}

		System.out.println("FF Pages:" + pageFFCollection);
		System.out.println("Chrome Pages:" + pageChromeCollection);

		Map<String, List<Page>> hashMap = new HashMap<>();

		for (Page page : pageCollection) {
			System.out.println("Html content" + page.htmlBuilder());
			String pageTitle = page.getTitle();
			if (!hashMap.containsKey(pageTitle)) {
				hashMap.put(pageTitle, new ArrayList<>());
			}
			hashMap.get(pageTitle).add(page);
		}

		System.out.println(hashMap);

		System.out.println("Unique titles:");

		for (Map.Entry<String, List<Page>> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey());
		}

	}
}
