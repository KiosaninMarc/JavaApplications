package entities;

public class Video extends Lesson {

	private String url;
	private Integer seconds;
	
	//Constructors
	public Video() {
		super();
	}
	
	public Video(String title, String url, Integer seconds) {
		super(title);
		this.url = url;
		this.seconds = seconds;
	}
	
	//Getters ad Setters
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Integer getSeconds() {
		return seconds;
	}
	
	public void setSeconds(Integer seconds) {
		this.seconds = seconds;
	}
	
	//Methods
	@Override
	public Integer duration() {
		return seconds;
	}
	
}
