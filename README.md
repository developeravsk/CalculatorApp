# CalculatorApp
A tutorial app on demonstration of building a simple calculator
No Mathematical Java functions used
Based on simple logic
Only for learning purposes


https://docs.google.com/forms/d/e/1FAIpQLSd4oaIsWSCnwBNsVEKabrnWIgpyQ3KMmVxQAiF5r7YXMJmQsg/viewform



for youtube parsing

     String part = "snippet,status";
    String fieds = "nextPageToken,items(snippet(publishedAt,title,resourceId,thumbnails),status)";
    String playlistid = "PLrEnWoR732-BHrPp_Pm8_VleD68f9s14-";
    String maxresults = "50";
    String apikey = "AIzaSyAJ7XL6febb9L2PNpiiIrmrG-dJNOGfZ9g";
    
    
      private static final String BASE_URL="https://www.googleapis.com/";
  
  
      @GET("youtube/v3/playlistItems")
    Call<Example> getData(@Query("part") String part, @Query("fields") String field, @Query("maxResults") String maxResults, @Query("playlistId") String playlistid, @Query("key") String key);

