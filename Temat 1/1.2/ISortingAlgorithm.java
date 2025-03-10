import java.util.ArrayList;
import java.util.List;

// Interfejs ISortingAlgorithm
public interface ISortingAlgorithm<T extends IMyComparable<T>> {
    void sort(List<T> list);
}

