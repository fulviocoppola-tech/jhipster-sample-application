package it.kedos.mia;

import it.kedos.mia.config.AsyncSyncConfiguration;
import it.kedos.mia.config.EmbeddedKafka;
import it.kedos.mia.config.EmbeddedSQL;
import it.kedos.mia.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { JhipsterSampleApplicationApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedSQL
@EmbeddedKafka
public @interface IntegrationTest {
}
