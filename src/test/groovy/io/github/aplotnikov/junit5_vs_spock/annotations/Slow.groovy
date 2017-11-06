package io.github.aplotnikov.junit5_vs_spock.annotations

import static java.lang.annotation.ElementType.METHOD
import static java.lang.annotation.RetentionPolicy.RUNTIME

import java.lang.annotation.Retention
import java.lang.annotation.Target

@Retention(RUNTIME)
@Target([METHOD])
@interface Slow {
}
