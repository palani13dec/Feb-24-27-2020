IntStream.range(1, 6).forEach(i -> System.out.println("Hello World"));
String postLunch = "Feeling sleepy and confused";
Files.write(Paths.get("./sleepy.txt"), postLunch.getBytes());
System.out.println("Done");