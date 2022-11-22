package com.example.assignment2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class APIUtility {

    public static List<Game> getGames() throws IOException, InterruptedException {
        String uri = "https://localhost:7092/api/games";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofFile(Paths.get("jsonData.json")));

        return new ArrayList<>();
    }

}
