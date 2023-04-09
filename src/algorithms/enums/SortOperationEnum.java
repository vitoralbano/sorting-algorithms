package algorithms.enums;

public enum SortOperationEnum {

    ASC("ASC") {
        @Override
        public boolean isSorted(Comparable value1, Comparable value2) {
            return value1.compareTo(value2) <= 0;
        }
    },
    DESC("DESC") {
        @Override
        public boolean isSorted(Comparable value1, Comparable value2) {
            return value1.compareTo(value2) >= 0;
        }
    };

    private String sort;

    public boolean isSorted(Comparable value1, Comparable value2) { return false; }

    SortOperationEnum (String sort) {
        this.sort = sort;
    }
}
