public class WriteDataWithAutoClose {
	public static void main(String[] args) throws Exception {
		java.io.File file = new java.io.File("scores.txt");
		if (file.exists()) {
		System.out.println("File already exists");
		System.exit(1);
		}
		try (java.io.PrintWriter output = new java.io.PrintWriter(file);) {
			// Write formatted output to the file
			output.format("%s\t%s\t%s\n", "홍길동", "2015110001", "COMP217");
			output.format("%s\t%s\t%s\n", "장발장", "2015110002", "COMP217");
		}
	}
}