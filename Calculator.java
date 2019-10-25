class Calculator {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.start();
	}

	public void start () {
		System.out.println("test: ");
		System.out.println(new RequestAnalizer().getA());
	}

}