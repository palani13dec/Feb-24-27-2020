package com.lab13;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Optional;

import org.apache.hc.client5.http.fluent.Content;
import org.apache.hc.client5.http.fluent.Request;
import org.json.JSONException;
import org.json.JSONObject;

public class MovieService {


	public void writeMovieResponseToFile(String response) {
		try {
			String movieName = new JSONObject(response).getString("Title");
			Files.write(Paths.get("./" + movieName + ".json"), response.getBytes());
		} catch (JSONException | IOException e) {
			e.printStackTrace();
		}

	}

	public boolean filterErrors(Optional<String> it) {
		if(it.isPresent()) {
			if(it.get().contains("Error")) {
				String movieName = it.get().split("Error:")[1].trim() + "\n";
				try {
					Files.write(Paths.get("./errors.txt"), movieName.getBytes(), StandardOpenOption.CREATE);
				} catch (IOException e) {
					e.printStackTrace();
				}
				return false;
			}
		}
		return true;
	}

	//HttpComponents jar file
	//java-json.jar
	public Optional<String> connectToServer(String movieName) {
		Optional<String> result = Optional.of("Error: " + movieName);
		try {
			String url = "http://www.omdbapi.com/?i=tt3896198&apikey=52d1c7f&t=";
			url = url + URLEncoder.encode(movieName, "UTF-8");
			Content content = Request
					.get(url)
					.execute()
					.returnContent();
			String jsonString = content.asString();
			JSONObject obj = new JSONObject(jsonString);
			if("True".equals(obj.get("Response"))) {
				result = Optional.of(jsonString);
			}
		} catch (IOException | JSONException e) {
			e.printStackTrace();
		}
		return result;
	}
}
