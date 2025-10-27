package ru.farming.livestock_farm.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenAPIConfiguration {

    @Value("${spring.application.name:App}")
    private String appName;

    @Value("${spring.application.version:any}")
    private String appVersion;

    @Value("${spring.application.description:any}")
    private String appDescription;

    @Value("${server.port:8080}")
    private String serverPort;

    @Bean
    public OpenAPI customOpenAPI() {

        Contact contact = new Contact();
        contact.setName("Терехов Александр");
        contact.url("https://github.com/TerekhoffAG/livestock-farm");

        Info info = new Info()
                .title("API " + appName)
                .version(appVersion)
                .description(appDescription)
                .contact(contact);

        Server server = new Server()
                .url("localhost" + ":" + serverPort)
                .description("Development");

        return new OpenAPI()
                .info(info)
                .servers(List.of(server));
    }
}
