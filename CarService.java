
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {
    private static final Logger logger = LoggerFactory.getLogger(CarService.class);

    public void myMethod() {
        logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warning message");
        logger.error("Error message");
    }

}
