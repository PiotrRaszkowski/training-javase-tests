package pl.jitsolutions.training.javasetests;

public class HappinesMaker {

    public void happy() throws UnexpectedUnhappyException {
        throw new UnexpectedUnhappyException("I am sad, please do something...");
    }

    public void beHappy() {
        throw new UnexpectedUnhappyError("I am so sad...");
    }

    public void lastTry() {
        throw new UnableToMakeHappinesException("No space to be happy...");
    }
}
