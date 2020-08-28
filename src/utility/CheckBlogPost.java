package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface {

	String[] badWords = { "asshole", "alabama hot pocket", "alaskan pipeline", "anal", "anal impaler", "anal leakage",
			"balls", "bangbros", "bareback", "barely legal", "barenaked", "barf", "bastard", "blowjob", "c.0.c.k",
			"c.o.c.k", "c.u.n.t", "c0ck", "c-0-c-k", "c0cksucker", "caca", "cacafuego", "cahone", "camel toe",
			"cameltoe", "camgirl", "camslut" };

	@Override
	public boolean checkBlogTitle(Blog blog) {
		String title = blog.getBlogTitle();
		for(int i=0;i<badWords.length;i++) {
			if(title == badWords[i]) {
				return false;
			}
		}
		return true;		
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		String description = blog.getBlogDescription();
		for(int i=0;i<badWords.length;i++) {
			if(description == badWords[i]) {
				return false;
			}
		}
		return true;
		
	}

	@Override
	public boolean checkBlog(Blog blog) {
		boolean blogTitle = checkBlogTitle(blog);
		boolean blogDesc = checkBlogDescription(blog);

		if (blogTitle && blogDesc) {
			return true;
		} else {
			return false;
		}
	}

}
