package java12.validation.experinse.chef;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(
        validatedBy = ExperienceValidatorChef.class
)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ExperienceValidationChef  {

    String message() default "Стаж должен больше 2 года";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
