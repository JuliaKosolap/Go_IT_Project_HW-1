package Module13.helpers;

import Module13.objects.UserPost;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.jsoup.Jsoup;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class UserPostsRequestHelper {

    public int getLastUserPostId(String url) throws IOException {
        String text = Jsoup.connect(url).ignoreContentType(true).get().body().text();
        Type type = TypeToken
                .getParameterized(List.class, UserPost.class)
                .getType();
        Gson gson = new Gson();
        List<UserPost> userPosts = gson.fromJson(text, type);
        int maxId = 1;
        for (UserPost post : userPosts
             ) {
            if (post.getId() > maxId) {
                maxId = post.getId();
            }
        }
        return maxId;
    }

    public void writeLastPostCommentsIntoFile(String url, String fileName) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .build();
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("response.statusCode() = " + response.statusCode());
        try(FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            byte[] buffer = response.body().getBytes();
            fileOutputStream.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
