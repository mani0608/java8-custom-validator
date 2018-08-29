package com.java8.tutor.common.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.java8.tutor.common.validators.NotNullOrBlankValidator;

/**
 * Reference: http://dolszewski.com/java/custom-parametrized-validation-annotation/
 * https://stackoverflow.com/questions/31132477/java-annotation-for-null-but-neither-empty-nor-blank
 * @author Manikandan.R
 *
 */

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER,
    ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint (validatedBy = NotNullOrBlankValidator.class)
@Documented
public @interface NotNullOrBlank {
	
	String message() default "Cannot be null";
	Class<?>[] groups() default { };
	Class<? extends Payload>[] payload() default { };
	
}
