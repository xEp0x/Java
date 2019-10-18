package bg.softuni.framework.parser.strategy;

import java.util.Map;


public interface AnnotationParserStrategy<C, R> {

    void parse(Map<C, R> cachedResult) throws IllegalAccessException, InstantiationException;
}
