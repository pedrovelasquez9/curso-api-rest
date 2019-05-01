package es.indra.demoblog.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Post {
	@Id
	@GeneratedValue
	int id;
	
	int userId;

	String title;

	String body;

	public Post(int id) {
		this.id = id;
	}

	public Post() {
	}

	public Post(int id, int userId, String title, String body) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String titulo) {
		this.title = titulo;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String contenido) {
		this.body = contenido;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int uid) {
		this.userId = uid;
	}
}
