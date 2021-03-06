package rube.amqp;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;
import rube.config.RabbitConfig;

@Configuration
@IntegrationComponentScan
@EnableAutoConfiguration
@Import({EchoFlowOutBound.class, EchoFlowInbound.class, RabbitConfig.class})
public class EchoFlow {
}
