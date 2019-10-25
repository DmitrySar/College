class RequestAnalizer {

	private  String[] args;
	private int INDEX_A = 0;
	private int INDEX_B = 2;
	private int INDEX_OF_OPERATION = 1;
	private ConsoleReader reader = new ConsoleReader();

    public RequestAnalizer() {
    	args = reader.getRequest().split(" ");
    }

    public double getA() {
    	return Double.valueOf(args[INDEX_A]);
    }

    public double getB() {
    	return 0;
    }

    public String getOperation() {
    	return null;
    }

}