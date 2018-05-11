package pl.jitsolutions.training.javasetests;

public class TextFormatter extends AbstractTextFormatter {
    String getSuffix() {
        return ".java";
    }

    public String formatNumber(int number) {
        return number + getSuffix();
    }
}
