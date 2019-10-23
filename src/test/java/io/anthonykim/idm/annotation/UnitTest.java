package io.anthonykim.idm.annotation;

import org.springframework.test.annotation.IfProfileValue;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@IfProfileValue(name = "test.profile", value = "unit")
public @interface UnitTest {
}
