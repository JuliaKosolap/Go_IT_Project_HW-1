package Module13;

import Module13.helpers.UserRequestsHelper;
import Module13.objects.User;

import java.io.IOException;
import java.net.http.HttpResponse;

public class Task1 {
    private static String URL = "https://jsonplaceholder.typicode.com";
    static private int id = 1;
    static private String username = "Samantha";

    public static void main(String[] args) throws IOException, InterruptedException, IOException {
        User createUser = new User();
        createUser.setName("Rassel Weissnat2");
        createUser.setUsername("RasWeis");
        createUser.setEmail("rasweis@gmail.com");
        createUser.setStreet("Rex Trail");
        createUser.setSuite("Suite 280");
        createUser.setCity("Howemouth");
        createUser.setZipcode("58804-1099");
        createUser.setLat("24.8918");
        createUser.setLng("21.8984");
        createUser.setPhone("210.067.6132");
        createUser.setWebsite("elvis.io");
        createUser.setCompanyName("Johns Group");
        createUser.setCatchPhrase("Configurable multimedia task-force");
        createUser.setBs("generate enterprise e-tailers");

        UserRequestsHelper helper = new UserRequestsHelper();
        helper.sendPost(URL + "/users", createUser);

        User editUser = new User();
        createUser.setName("Rassel Weissnat3");
        createUser.setUsername("RasWeis");
        createUser.setEmail("rasweis3@gmail.com");
        createUser.setStreet("Rex Trail");
        createUser.setSuite("Suite 280");
        createUser.setCity("Howemouth");
        createUser.setZipcode("58804-1099");
        createUser.setLat("24.8918");
        createUser.setLng("21.8984");
        createUser.setPhone("210.067.6132");
        createUser.setWebsite("elvis.io");
        createUser.setCompanyName("Johns Group");
        createUser.setCatchPhrase("Configurable multimedia task-force");
        createUser.setBs("generate enterprise e-tailers");

        helper.sendPatch(URL + "/users/9", editUser);
        helper.sendDelete(URL + "/users/1");
        HttpResponse allUsersResponse = helper.sendGetAllUsersInfo(URL + "/users");
        System.out.println("response.statusCode() = " + allUsersResponse.statusCode());
        System.out.println("response.body() = " + allUsersResponse.body());

        String idToString = String.valueOf(id);
        String userUrl = URL + "/users/" + idToString;
        HttpResponse userByIdResponse = helper.sendGetUserInfoByID(userUrl);
        System.out.println("response.statusCode() = " + userByIdResponse.statusCode());
        System.out.println("response.body() = " + userByIdResponse.body());

        String usernameUrl = URL + "/users?username=" + username;
        HttpResponse userByUsernameResponse = helper.sendGetUserInfoByUsername(usernameUrl);
        System.out.println("response.statusCode() = " + userByUsernameResponse.statusCode());
        System.out.println("response.body() = " + userByUsernameResponse.body());
    }
}

