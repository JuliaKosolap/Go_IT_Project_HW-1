package Module13.helpers;

import Module13.helpers.objects.UserTask;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;

public class UserTasksRequestsHelper {
    private Gson gson = new Gson();
    public void getAllUserTasks(String url) throws IOException {

        String text = Jsoup.connect(url).ignoreContentType(true).get().body().text();
        Type type = TypeToken
                .getParameterized(List.class, UserTask.class)
                .getType();
        List<UserTask> userTasks = gson.fromJson(text, type);
        userTasks = userTasks.stream().filter(item -> !item.isCompleted())
                .collect(Collectors.toList());
        for (UserTask task : userTasks) {
            System.out.println("task = " + task);
        }
    }
}
