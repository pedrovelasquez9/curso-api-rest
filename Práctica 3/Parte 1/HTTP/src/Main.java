import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpClient httpClient = HttpClient.newBuilder()
	               .version(Version.HTTP_2)  // this is the default
	               .build();
		
		
		HttpRequest request = HttpRequest.newBuilder()
               .uri(URI.create("https://jsonplaceholder.typicode.com/todos/1"))
               .GET()   // this is the default
               .build();

		HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
		
		System.out.print("Response body del GET: " + response.body());
		
		//POST
		String json = "";
		json = "{title: 'foo',\r\n" + 
				"      body: 'bar',\r\n" + 
				"      userId: 1}";
		HttpRequest mainRequest = HttpRequest.newBuilder()
               .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
               .POST(BodyPublishers.ofString(json))
               .build();
		HttpResponse<String> response2 = httpClient.send(mainRequest, BodyHandlers.ofString());

		System.out.print("Response body del POST: " + response2.body());
	}

}
