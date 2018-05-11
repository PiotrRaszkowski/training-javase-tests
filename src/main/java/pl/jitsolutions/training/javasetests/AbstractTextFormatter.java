package pl.jitsolutions.training.javasetests;

public abstract class AbstractTextFormatter {
    
    public String formatText(String text) {
        return text + getSuffix();
    }
    
    abstract String getSuffix();
}
