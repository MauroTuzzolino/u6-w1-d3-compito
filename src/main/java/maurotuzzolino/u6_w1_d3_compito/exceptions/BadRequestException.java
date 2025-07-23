package maurotuzzolino.u6_w1_d3_compito.exceptions;

public class BadRequestException extends RuntimeException {

    public BadRequestException(String message) {
        super(message);
    }
}