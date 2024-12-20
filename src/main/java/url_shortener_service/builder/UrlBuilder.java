package url_shortener_service.builder;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Component
public class UrlBuilder {
    public String buildUrl(String hash) {
        return ServletUriComponentsBuilder
                .fromCurrentContextPath()
                .path("url_shortener/{hash}")
                .buildAndExpand(hash)
                .toUriString();
    }
}
