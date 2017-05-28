package models;

public enum LineSize {
	
	SMALL_SIZE	(1),
	MEDIUM_SIZE	(2),
	LARGE_SIZE	(4);
	
	private final int num_lines;
	
	LineSize(int num_lines){
		this.num_lines = num_lines;
	}
	
	public int numLines(){
		return num_lines;
	}

}
