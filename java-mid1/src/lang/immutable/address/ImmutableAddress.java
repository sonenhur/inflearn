package lang.immutable.address;

public class ImmutableAddress {
    //불변 객체: 내부 값이 변경되면 안 됨
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    //setValue()는 제거
    
    @Override
    public String toString() {
        return "Address{" + "value='" + value + '\'' + '}';
    }
}
