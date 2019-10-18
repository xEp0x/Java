package bg.softuni.provider.type;


public interface TypeProvider {

    Class[] getClassesByAnnotation(Class annotation);
}
