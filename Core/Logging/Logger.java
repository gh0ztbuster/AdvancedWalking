package scripts.AdvancedWalking.Core.Logging;

/**
 * Interface for any text logger.
 * @author Laniax
 */
public interface Logger {

    void writeInformation(String message);

    void writeWarning(String message);

    void writeError(String message);

    void writeDebug(String message);
}