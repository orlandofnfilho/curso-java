package exec012;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import exec012.entities.Comment;
import exec012.entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome!");
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the force be with you");

		Post post1 = new Post("Traveling to New Zealand", "I'm going to visit this wonderful country!", 12, sdf.parse("21/06/2016 13:05:44"));
		Post post2 = new Post("Good night guys", "See you tomorrow", 5, sdf.parse("27/08/2018 23:14:19"));
		
		
		post1.addComment(c1);
		post1.addComment(c2);
		
		System.out.println(post1);
		System.out.println();
		post2.addComment(c3);
		post2.addComment(c4);
		System.out.println(post2);
		
		
		

	}

}
