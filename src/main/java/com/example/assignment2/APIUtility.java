package com.example.assignment2;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;

public class APIUtility {

    public static Game[] getGames() throws IOException, InterruptedException {
        String uri = "https://fighterstatsnet.azurewebsites.net/api/games";

        HttpClient.newHttpClient().send(HttpRequest.newBuilder().uri(URI.create(uri)).build(), HttpResponse.BodyHandlers.ofFile(Paths.get("jsonData.json")));

        Gson gson = new Gson();
        Game[] apiResponse = null;

        try(JsonReader jsonReader = new JsonReader(new FileReader("jsonData.json"))) {
            apiResponse = gson.fromJson(jsonReader, Game[].class);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return apiResponse;
    }

}
