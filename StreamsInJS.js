let languages = ["Java", "Ruby", "Groovy", "JavaScript", "Scala"];
languages
	.filter(it => {
		console.log("***Filter 1 " + it);
		return it.startsWith("J");
	})
	.filter(it => {
		console.log("***Filter 2 " + it);
		return it.length > 5;
	});
	//.forEach(it => console.log(it));