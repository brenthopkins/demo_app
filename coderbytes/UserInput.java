package coderbytes;

public class UserInput {
    private static String value = new String();
    public static class TextInput {
    	public void add(char c) {
    		value = value + c;
    	}
    	public String getValue() {
			return value;
    		
    	}
    }

    public static class NumericInput extends TextInput {
    	public void add(char c) {
    		if (Character.isDigit(c)) {
    			value = value + c;
    		}
    	}
    	
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}