package top.lixiaogang.pattern.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by lixiaogang on 2018/4/4.
 */
@Slf4j
public class testCase {

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLogger();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        log.info("--------------");
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        log.info("--------------");
        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }

    public static AbstractLogger getChainOfLogger() {
        AbstractLogger consuleLogger = new ErrorLogger(AbstractLogger.INFO);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);

        consuleLogger.setNext(debugLogger);
        debugLogger.setNext(errorLogger);

        return consuleLogger;
    }
}
