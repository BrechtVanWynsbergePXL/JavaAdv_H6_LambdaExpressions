package be.pxl.ja.demo4;

public class Document {
	private DocumentState state;
	private String name;

	public Document(String name) {
		this.name = name;
		state = DocumentState.CREATED;
	}

	public enum  DocumentState {
		CREATED,
		ACCEPTED,
		REJECTED;
	}
}
