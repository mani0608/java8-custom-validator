import javax.validation.Configuration;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.java8.tutor.common.Person;

public class Java8CustomValidator {
	
	private static final Validator validator;

    static {
        Configuration<?> config = Validation.byDefaultProvider().configure();
        ValidatorFactory factory = config.buildValidatorFactory();
        validator = factory.getValidator();
        factory.close();
    }
	
	public static void main(String[] args) {
				
		// TODO Auto-generated method stub
		Person person = new Person(null, -10);
		validator.validate(person).stream().forEach(System.out::println);
		System.out.println("Person Validated");
	}

}
