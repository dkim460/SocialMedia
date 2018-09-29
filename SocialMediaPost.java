/**
* This class represents an interface called SocialMediaPost
* which is used by the three media classes (Tweet, FacebookPost,
* and InstagramPost)
* in order to make coding a lot shorter, and a LOT simplier to for example
* add another form of media i.e. Youtube.
* @author David Kim
* @version 13.31
*/
public interface SocialMediaPost {

    /**
    * This method is the base method of the getter of author
    * that will be used/overwritten in any class that implements it
    * @return an object of type person
    */
    Person getAuthor();

    /**
    * This method is the base method of the getter of content
    * that will be used/overwritten in any class that implements it
    * @return a String
    */
    String getContent();

    /**
    * This method is the base method of adding a person into your favorites
    * that will be used/overwritten in any class that implements it. It does
    * not return anything
    * @param favoriter the person you want to add to favorite
    */
    void addFavorite(Person favoriter);

    /**
    * This method is the base method of adding a person into your shares
    * that will be used/overwritten in any class that implements it. It does
    * not return anything
    * @param sharer the person you want to add to shares
    */
    void addShare(Person sharer);

    /**
    * This method is the base method of adding a comment that will
    * be used/overwritten in any class that implements it. It does not
    * return anything
    * @param commenter the person making the comment
    * @param body the content of the comment
    */
    void addComment(Person commenter, String body);

    /**
    * This method is the base method of the getter of favorites that will be
    * used/overwritten in any class that implements this.
    * @return an integer of the amount of favorites
    */
    int getFavorites();

    /**
    * This method is the base method of the getter of shares that will be
    * used/overwritten in any class that implements this.
    * @return an integer of the amount of shares
    */
    int getShares();

    /**
    * This method is the base method of the getter of comments that will
    * be used/overwritten in any class that implements this.
    * @return an integer of the amount of comments
    */
    int getComments();

    /**
    * This method is the base method of the toString that will be
    * used/overwritten in any class that implements it
    * @return a string
    */
    String toString();
}