package javas;





public class WikiArt {
    public static void main(String[] args) {
        //String title = "Python_(programming language)";
       // String article = getArticle(title);
        String test5 = getArticle(null);
        System.out.println(test5.contains("Some content"));
       // System.out.println("Article content:");
      //  System.out.println(article);
    }

    public static String getArticle(String title) {
        if (title == null) {
            return "Error: Title cannot be null.";
        }
        try {
            String encodedTitle = title.replace(" ", "%20");
            String urlString = "https://en.wikipedia.org/api/rest_v1/page/html/" + encodedTitle;
            java.net.URL url = new java.net.URL(urlString);
            java.net.HttpURLConnection connection = (java.net.HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(connection.getInputStream()));

            String line;
            StringBuilder content = new StringBuilder();
            while ((line = in.readLine()) != null) {
                content.append(line);
            }

            in.close();
            return content.toString();
        } catch (java.io.FileNotFoundException e) {
            return "Error: The requested article does not exist.";
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return "Error fetching article content";
        }
    }
}
