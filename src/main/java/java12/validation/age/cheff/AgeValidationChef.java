package java12.validation.age.cheff;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(
        validatedBy = AgeValidatorChef.class
)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface AgeValidationChef {
    String message() default "{Должен 25 до 45 лет !}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};



}
