package HackerRank.TestDocplanner.Wikipedia.Wikipedia;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class MainWikipedia {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		getTopicCount("pizza");
	}

	public static int getTopicCount(String topic) {
		//Instance httpclient
		HttpClient client = HttpClient.newHttpClient();

		//Build request
		String requestPath = "https://en.wikipedia.org/w/api.php?action=parse&section=0&prop=text&format=json&page="+topic;
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(requestPath)).GET().build();

		//Execute request and save response
		String responseString = "";
		try {
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			responseString = response.body();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(responseString);

		//Access the json response and count the number of times the word "pizza" appears after the "text" key
		int count = 0;
		//Split string on the word \"text\"
		String[] responseArray = responseString.split("\"text\"");
		String responseAfterText = responseArray[1];
		String[] responseTopicArray = responseString.split(topic);

		System.out.println(responseTopicArray.length - 1);


		return 0;

	}

}