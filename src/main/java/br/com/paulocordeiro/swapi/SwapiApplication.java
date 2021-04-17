package br.com.paulocordeiro.swapi;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.params.CoreConnectionPNames;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author paulocordeiro
 * default application entry point
 */
@SpringBootApplication
public class SwapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwapiApplication.class, args);
    }

    /**
     * RestTemplate to invoke rest services
     * @return RestTemplate
     */
    @Bean
    public RestTemplate restTemplate() {
        ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient());
        return new RestTemplate(requestFactory);
    }

    /**
     * Custom HTTP Client
     * @return Apache CloseableHttpClient
     */
    @Bean
    public CloseableHttpClient httpClient() {
        int timeout = 7;
        RequestConfig requestConfig = RequestConfig.custom()
                .setRedirectsEnabled(true)
                .setConnectTimeout(timeout * 1000)
                .setConnectionRequestTimeout(timeout * 1000)
                .setSocketTimeout(timeout * 1000)
                .build();
        return HttpClients.custom()
                .setDefaultRequestConfig(requestConfig)
                .build();
    }
}
