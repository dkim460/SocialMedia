import java.util.ArrayList;

/**
* This class represents an interface called SocialManager
* which will be used by SocialManager. This will help
* to make coding a lot shorter, and a LOT simplier to for example
* add another class that is similar to that of Social Manager
* @author David Kim
* @version 13.31
* @param <T> which represents a generic type
*/
public interface NewsSource<T> {

    /**
    * This method is the base method of the getter of Articles
    * that will be used/overwritten in any class that implements it
    * @return an ArrayList of generic type
    */
    ArrayList<T> getArticles();

    /**
    * This method is the base method of the getter of a random Article
    * that will be used/overwritten in any class that implements it
    * @return a generic type
    */
    T getRandomArticle();
}