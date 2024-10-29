package ru.urfu;

/**
 * Обработка сообщения
 */
public class ProcessingMessage {

    /**
     * Обработать сообщение пользователя
     */
    public String process(String message) {
        return String.format("Ваше сообщение: '%s'", message);
    }
}
