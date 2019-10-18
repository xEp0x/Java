package bg.softuni.framework.parser.strategy;

import bg.softuni.framework.lifecycle.component.Component;
import bg.softuni.provider.type.TypeProvider;

import java.util.Map;

public class ComponentAnnotationParsesStrategy implements AnnotationParserStrategy<Class, Class> {

    private TypeProvider provider;

    public ComponentAnnotationParsesStrategy(TypeProvider provider) {
        this.provider = provider;
    }

    @Override
    public void parse(Map<Class, Class> cachedResult) {

        for (Class annotatedClass : this.provider.getClassesByAnnotation(Component.class)) {
            for (Class parent : annotatedClass.getInterfaces()) {
                cachedResult.put(parent, annotatedClass);
            }
        }


    }
}
