package exam.blankquiz.domain.shared;

public interface ValueObject<T> {
    boolean sameValueAs(T other);
}
