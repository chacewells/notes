class Foo {
    public int getFantasticMapping(String str) {
        return switch (str) {
            case "foo" -> 0;
            case "bar" -> 1;
            case "baz" -> 2;
            case "bang" -> 3;
            case "biff" -> 4;
            case "bop" -> 5;
            case "boom" -> 6;
            default -> 7;
        }
    }
}
