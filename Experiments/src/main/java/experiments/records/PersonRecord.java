package experiments.records;

public record PersonRecord (
	String name,
	String address
) {
	public static String UNKNOWN_ADDRESS = "Unknown";
	
}
