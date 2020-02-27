import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		String output = fetchRecordFromDBOld("query");
		if(output != null) {
			System.out.println("Result: " + output.toUpperCase());
		}
		else {
			System.out.println("Not Available");
		}
			
		Optional<String> result = fetchRecordFromDB("query");
		if(result.isPresent()) {
			System.out.println("OK: " + result.get());
		}
		else if(result.isEmpty()) {
			System.out.println("Not present");
		}
		
		System.out.println("Salary " + findSalaryOfPersonInDB(101)); 
	}

	static String findSalaryOfPersonInDB(int personId) {
		//execute the query
		double randomNumber = Math.random();
		String output = randomNumber > 0.5 ? "ok" : null;
		return Optional
			.ofNullable(output)
			.orElseThrow(RuntimeException::new);
	}
	
	
	static Optional<String> fetchRecordFromDB(String query) {
		//execute the query
		Optional<String> output = Math.random() > 0.5 ? Optional.of("Cool") : Optional.empty();
		return output;
	}
	
	
	//REturning null values from method is not a correct design
	static String fetchRecordFromDBOld(String query) {
		//execute the query
		String output = Math.random() > 0.5 ? "Cool" : null;
		if(output == null)
			return "NOT PRESENT";
		return output;
	}

}
