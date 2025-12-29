package exceptions;

public class PersonneNotFoundException extends RuntimeException {
    public PersonneNotFoundException(Long id) {
        super("Personne non trouvée avec l'ID : " + id);
    }
}