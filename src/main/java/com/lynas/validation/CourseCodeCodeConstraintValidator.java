package com.lynas.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
    private String coursePrefix;

    @Override
    public void initialize(CourseCode constraintAnnotation) {
        coursePrefix=constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String theCode,
                           ConstraintValidatorContext constraintValidatorContext) {
        boolean result;

        if(theCode!=null)
            result = theCode.startsWith(coursePrefix);
        else
            result=false;
        return result;
    }
}
