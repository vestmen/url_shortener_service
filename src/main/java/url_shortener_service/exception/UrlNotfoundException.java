package url_shortener_service.exception;

public class UrlNotfoundException extends RuntimeException {
    public UrlNotfoundException(String message, Object... args) {
        super(String.format(message, args));
    }
}
