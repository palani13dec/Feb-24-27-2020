package com.lab13;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Lab13Main {

	public static void main(String[] args) throws Exception {
		List<String> movies = Files.readAllLines(Paths.get("./movies.txt"));
		
		ForkJoinPool fjp = new ForkJoinPool(100);
		fjp.execute(() -> {
			loadMovies(movies);
		});
		Thread.sleep(100000);
	}

	private static void loadMovies(List<String> movies) {
		MovieService movieService = new MovieService();
		movies
			.parallelStream()
			//.limit(1)
			.map(movieService::connectToServer)
			.filter(movieService::filterErrors)
			.map(it -> it.get())
			.peek(it -> System.out.println(it))
			.forEach(movieService::writeMovieResponseToFile);
	}

	
}
