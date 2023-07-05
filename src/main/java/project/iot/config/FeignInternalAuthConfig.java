package project.iot.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;

public class FeignInternalAuthConfig {
    @Bean
    public RequestInterceptor internalAuthenticationRequestInterceptor() {
        return new FeignClientInterceptor();
    }

    private static final String API_KEY = "NNSXS.AFXIMSE6QXHFGBFXSYHMQQ6XFXJKDAOKRNFGHHI.N4WWBDZ7B7TNJA4IKJ6DGZAS6PNSRQBXZSWPFZT5ZSON52NGJW2A";

    public static class FeignClientInterceptor implements RequestInterceptor {

        @Override
        public void apply(RequestTemplate requestTemplate) {
            requestTemplate
                    .header(HttpHeaders.AUTHORIZATION, String.format("Bearer %s", API_KEY));

        }
    }
}
