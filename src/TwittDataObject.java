
public class TwittDataObject {
  
  private String date;
  private String handle; 
  private String name; 
  private String text; 
  private String url; 
  private String platform; 
  private String type; 
  private String retweetCount; 
  private String favoriteCount; 
  
  public TwittDataObject(String data, String handle, String name, String text, String url, 
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
  
  public String getDate() {
    
    return date; 
  }
  
  public void setDate(String dateVal) {
    
    this.date = dateVal; 
  }
  
  public String getHandle() {
    
    return handle; 
  }
  
  public void setHandle(String handleVal) {
    
    this.handle = handleVal; 
  }
  
  public String getName() {
    
    return name; 
  }
  
  public void setName(String nameVal) {
    
    this.name = nameVal; 
  }
  
  public String getText() {
    
    return text; 
  }
  
  public void setText(String textVal) {
    
    this.text = textVal; 
  }
  
  public String getURL() {
    
    return url; 
  }
  
  public void setURL(String urlVal) {
    
    this.url = urlVal;
  }
  
  public String getPlatform() {
    
    return platform; 
  }
  
  public void setPlatform(String platformVal) {
    
    this.platform = platformVal; 
  }
  
  public String getType() {
    
    return type; 
  }
  
  public void setType(String typeVal) {
    
    this.type = typeVal; 
  }
  
  public String getRetweetCount() {
    
    return retweetCount; 
  }
  
  public void setRetweetCount(String retweetCntVal) {
    
    this.retweetCount = retweetCntVal; 
  }
  
  public String getFavoriteCount() {
    
    return favoriteCount; 
  }
  
  public void setFavoriteCount(String favoriteCntVal) {
    
    this.favoriteCount = favoriteCntVal; 
  }
  
  public String toString() {
    
    return getDate() + ", " + getHandle() + ", " + getName() + ", " + getText() + ", " + getURL() + ", " + 
           getPlatform() + ", " + getType() + ", " + getRetweetCount() + ", " + getFavoriteCount(); 
    
  }
}
