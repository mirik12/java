package l12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(value = RetentionPolicy.RUNTIME)
	public @interface MyAnnot {
	     String name();
	     int go() default  “go”;
	}
}
