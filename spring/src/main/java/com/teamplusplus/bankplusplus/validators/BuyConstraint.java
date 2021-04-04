package com.teamplusplus.bankplusplus.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = BuyValidator.class)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BuyConstraint {
  String message() default "Invalid Ticker or Invalid Account Id or Insufficient Balance";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
