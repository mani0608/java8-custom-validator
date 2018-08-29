package com.java8.tutor.common.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.java8.tutor.common.annotations.NotNullOrBlank;

/**
 * Reference: http://dolszewski.com/java/custom-parametrized-validation-annotation/
 * @author Manikandan.R
 *
 */

public class NotNullOrBlankValidator implements ConstraintValidator<NotNullOrBlank, Object> {

		
	@Override
	public void initialize(NotNullOrBlank constraintAnnotation) {
		// TODO Auto-generated method stub
		//ConstraintValidator.super.initialize(constraintAnnotation);
		System.out.println("Initialized validator");
	}

	@Override
	public boolean isValid(Object arg0, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		if (arg0 == null) 
			return false;
		return true;
	}

}
