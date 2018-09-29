import java.util.ArrayList;

/**
* This class represents a Tweet object
* @author David Kim
* @version 13.31
*/
public class InstagramPost implements SocialMediaPost {
    private Person author;
    private String content;
    private ArrayList<Person> likes = new ArrayList<>();
    private ArrayList<Person> shares = new ArrayList<>();
    private ArrayList<InstagramPost> comments = new ArrayList<>();
    private int numLikes;
    private int numShares;
    private int numComments;

    /**
    * This constructor takes in a object of type person and a string
    * and instantiates them
    * @param author the author of the post
    * @param content the content of the post
    */
    public InstagramPost(Person author, String content) {
        this.author = author;
        this.content = content;
    }

    /**
    * This method takes in no parameters and returns the content of the post
    * @return content which is the content of the post.
    */
    public String getContent() {
        return content;
    }

    /**
    * This method takes in no parameters and returns the author of the post
    * @return author which is the author of the post
    */
    public Person getAuthor() {
        return author;
    }

    /**
    * This method takes in an object of type person and adds them into the
    * ArrayList called likes. It does not return anything.
    * @param liker is the person you want to add
    */
    public void addFavorite(Person liker) {
        likes.add(liker);
    }

    /**
    * This method takes in an object of type person and adds them into the
    * ArrayList called shares. It does not return anything.
    * @param sharer is the person you want to add
    */
    public void addShare(Person sharer) {
        shares.add(sharer);
    }

    /**
    * This method takes in an object of type person and a string and
    * creates a new comment and then adds the new comment into the ArrayList
    * called comments. It does not return anything.
    * @param commenter is the person who made the comment
    * @param body is the content of the comment
    */
    public void addComment(Person commenter, String body) {
        InstagramPost comment = new InstagramPost(commenter, body);
        comments.add(comment);
    }

    /**
    * This method takes in no parameters and returns the number of likes
    * @return numLikes which is the number of likes
    */
    public int getFavorites() {
        return numLikes;
    }

    /**
    * This method takes in no parameters and returns the number of shares
    * @return numShares which is the number of shares
    */
    public int getShares() {
        return numShares;
    }

    /**
    * This method takes in no parameters and returns the number of comments
    * @return numcomments which is the number of comments
    */
    public int getComments() {
        return numComments;
    }

    /**
    * This method takes in no parameters and retuns a string containing the
    * author, content, number of shares, and number of comments
    * @return s the String containing the author, content, numshares,
    * and numcomments.
    */
    public String toString() {
        String s = String.format("%s:%n\t\u201C%s\u201D%n%d Likes | %d Shares"
            + " | %d Comments%n",
            author.toString(), content, numLikes, numShares, numComments);
        return s;
    }
}