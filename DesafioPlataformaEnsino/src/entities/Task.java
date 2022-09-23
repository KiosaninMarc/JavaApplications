package entities;

public class Task extends Lesson {

	private String description;
	private Integer questionCount;
	
	//Constructors
	public Task() {
		super();
	}
	
	public Task(String title, String description, Integer questionCount) {
		super(title);
		this.description = description;
		this.questionCount = questionCount;
	}
	
	//Getters and Setters
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getQuestionCount() {
		return questionCount;
	}
	
	public void setQuestionCount(Integer questionCount) {
		this.questionCount = questionCount;
	}
		
	//Methods
	@Override
	public Integer duration() {
		return questionCount * 5 * 60;
	}
}
