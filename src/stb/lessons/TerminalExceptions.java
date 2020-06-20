package stb.lessons;

import java.io.IOException;

class TerminalException extends Exception {
    public TerminalException() {
    }

    public TerminalException(String message) {
        super(message);
    }

    public TerminalException(String message, Throwable cause) {
        super(message, cause);
    }
}

class PinValidateException extends TerminalException {
}

class PinLockException extends TerminalException {
    // Время, оставшееся до окончания блокировки
    private final int timeRemaining;

    public PinLockException(int timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    public int timeRemaining() { return timeRemaining; }
}

class ServerConnectionException extends TerminalException {
    public ServerConnectionException(String message) {
        super(message);
    }
}

class ServerBalanceException extends TerminalException {
    public ServerBalanceException(String message) {
        super(message);
    }
}

class TerminalAmountException extends TerminalException {
    // Запрашиваемая или вносимая сумма
    private final int amount;

    public TerminalAmountException(int amount) {
        this.amount = amount;
    }

    public int amount() { return amount; }
}
