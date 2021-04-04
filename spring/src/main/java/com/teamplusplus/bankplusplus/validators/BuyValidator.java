package com.teamplusplus.bankplusplus.validators;

import com.teamplusplus.bankplusplus.models.AccountRepository;
import com.teamplusplus.bankplusplus.models.ArrayMethods;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraintvalidation.SupportedValidationTarget;
import javax.validation.constraintvalidation.ValidationTarget;

@SupportedValidationTarget(ValidationTarget.PARAMETERS)
public class BuyValidator implements ConstraintValidator<BuyConstraint, Object[]> {
  private final AccountRepository accountRepository;

  public BuyValidator(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }

  @Override
  public boolean isValid(Object[] value, ConstraintValidatorContext context) {
    if (accountRepository.getAccount((String) value[0]) == null) {
      return false;
    }

    double balance = accountRepository.getAccount((String) value[0]).getBalance();
    return ArrayMethods.findStockPrice((String) value[1]) != -1 && balance >= ArrayMethods.findStockPrice((String) value[1]) * (int) value[2];
  }
}
