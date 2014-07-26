/**
 * Representing the row of data from the CSV file.
 * 
 * @author Hansen Cheng and Micah Angeles
 *
 */
public class TweetRecord {
  
  private String date;
  private String handle; 
  private String name; 
  private String text; 
  private String url; 
  private String platform; 
  private String type; 
  private String retweetCount; 
  private String favoriteCount; 
  
  /**
   * Constructing the lines of information.
   * 
   * @param data
   * @param handle
   * @param name
   * @param text
   * @param url
   * @param platform
   * @param type
   * @param retweetCount
   * @param favoriteCount
   */
  public TweetRecord(String data, String handle, String name, String text, String url, 
                        String platform, String type, String retweetCount, String favoriteCount ) {
    
    this.date = data; 
    this.handle = handle; 
    this.name = name; 
    this.text = text; 
    this.url = url; 
    this.platform = platform; 
    this.type = type; 
    this.retweetCount = retweetCount; 
    this.favoriteCount = favoriteCount; 
    
  }
  
  /**
   * Retrieves when the comment was posted.
   * 
   * @return date - the date of the comment.
   */
  public String getDate() {
    
    return date; 
  }
  
  /**
   * Sets a new date for the comment
   * 
   * @param dateVal - date
   */
  public void setDate(String dateVal) {
    
    this.date = dateVal; 
  }
  
  /**
   * 
   * @return handle
   */
  public String getHandle() {
    
    return handle; 
  }
  
  /**
   * 
   * @param handleVal
   */
  public void setHandle(String handleVal) {
    
    this.handle = handleVal; 
  }
  
  /**
   * 
   * @return name - name of the person who submitted the comment.
   */
  public String getName() {
    
    return name; 
  }
  
  public void setName(String nameVal) {
    
    this.name = nameVal; 
  }
  
  /**
   * The comment made by the user.
   * 
   * @return text - comment.
   */
  public String getText() {
    
    return text; 
  }
  
  /**
   * Replace the previous comment with the new comment.
   * 
   * @param textVal - comment.
   */
  public void setText(String textVal) {
    
    this.text = textVal; 
  }
  
  /**
   * Address from the page where the user submitted their comments.
   * 
   * @return url - address of the site where the comment was made.
   */
  public String getURL() {
    
    return url; 
  }
  
  /**
   * Another address if the comment changes.
   * 
   * @param urlVal - new address.
   */
  public void setURL(String urlVal) {
    
    this.url = urlVal;
  }
  
  /**
   * Type of product used in submitting the comment.
   * 
   * @return platform - the type of product.
   */
  public String getPlatform() {
    
    return platform; 
  }
  
  /**
   * Another type of product.
   * 
   * @param platformVal - type of product.
   */
  public void setPlatform(String platformVal) {
    
    this.platform = platformVal; 
  }
  
  /**
   * Status of the comment if it was made before or just a new one.
   * 
   * @return type - the status of the comment.
   */
  public String getType() {
    
    return type; 
  }
  
  /**
   * Different type of status for the comment.
   * 
   * @param typeVal - a new type of comment.
   */
  public void setType(String typeVal) {
    
    this.type = typeVal; 
  }
  
  /**
   * Amount of times the person re-submitted the comment.
   * 
   * @return retweetCount - comment remade times.
   */
  public String getRetweetCount() {
    
    return retweetCount; 
  }
  
  /**
   * A new amount of times the user re-submitted the comment.
   * 
   * @param retweetCntVal - comment remade times.
   */
  public void setRetweetCount(String retweetCntVal) {
    
    this.retweetCount = retweetCntVal; 
  }
  
  /**
   * The amount of people who deemed this comment as their favorite.
   * 
   * @return favoriteCount - amount of people liking it.
   */
  public String getFavoriteCount() {
    
    return favoriteCount; 
  }
  
  /**
   * 
   * @param favoriteCntVal - amount of people liking it.
   */
  public void setFavoriteCount(String favoriteCntVal) {
    
    this.favoriteCount = favoriteCntVal; 
  }
  
  /**
   * Print out whole line of data.
   */
  public String toString() {
    
    return getDate() + ", " + getHandle() + ", " + getName() + ", " + getText() + ", " + getURL() + ", " + 
           getPlatform() + ", " + getType() + ", " + getRetweetCount() + ", " + getFavoriteCount(); 
    
  }
}
