package aht.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import aht.Model.UserDTO;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return UserDTO.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		UserDTO userdto = (UserDTO) target;
		if (userdto.getName() == null || userdto.getName().length() == 0) {
			errors.rejectValue("name", "null.validator");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Address", "null.validator");

		if (userdto.getAddress().length() < 6) {
			errors.rejectValue("Address", "address.validator");
		}

	}

}
