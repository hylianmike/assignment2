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
import java.util.ArrayList;

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

    public static ArrayList<Fighter> getFighters(int id) throws IOException, InterruptedException {
        String uri = "https://fighterstatsnet.azurewebsites.net/api/fighters";

        HttpClient.newHttpClient().send(HttpRequest.newBuilder().uri(URI.create(uri)).build(), HttpResponse.BodyHandlers.ofFile(Paths.get("jsonData.json")));

        Gson gson = new Gson();
        Fighter[] apiResponse = null;

        try(JsonReader jsonReader = new JsonReader(new FileReader("jsonData.json"))) {
            apiResponse = gson.fromJson(jsonReader, Fighter[].class);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        ArrayList<Fighter> results = new ArrayList<>();

        for (int i = 0; i < apiResponse.length; i++)
            if (apiResponse[i].getGameId() == id)
                results.add(apiResponse[i]);

        return results;
    }

    public static ArrayList<Attack> getAttacks(int id) throws IOException, InterruptedException {
        String uri = "https://fighterstatsnet.azurewebsites.net/api/attacks";

        HttpClient.newHttpClient().send(HttpRequest.newBuilder().uri(URI.create(uri)).build(), HttpResponse.BodyHandlers.ofFile(Paths.get("jsonData.json")));

        Gson gson = new Gson();
        Attack[] apiResponse = null;

        try(JsonReader jsonReader = new JsonReader(new FileReader("jsonData.json"))) {
            apiResponse = gson.fromJson(jsonReader, Attack[].class);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        ArrayList<Attack> results = new ArrayList<>();

        for (int i = 0; i < apiResponse.length; i++)
            if (apiResponse[i].getFighterId() == id)
                results.add(apiResponse[i]);

        return results;
    }

}
