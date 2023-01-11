package com.example.moneytransfer.model;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Класс для обозначения данных карт перевода
 *
 * @author svetlanamuratova
 * @version 1.1
 */
@Data
@Component
public class Cards {
    /**
     * поле карты с которой выполняется перевод
     */
    @NotNull(message = "Введите номер карты")
    @Size(min = 16, max = 16, message = "Номер карты состоит из 16 цифр")
    private String cardFromNumber;
    /**
     * поле карты на которую выполняется перевод
     */
    @Size(min = 16, max = 16, message = "Номер карты состоит из 16 цифр")
    @NotNull(message = "Введите номер карты")
    private String cardToNumber;
    @Size(min = 4, max = 4, message = "ввести формат mm/dd из 4-х цифр")
    /** поле корректного срока действия карты с которой выполняется перевод*/
    @FutureOrPresent
    @NotNull(message = "Введите срок действия карты")
    private String cardFromValidTill;
    /**
     * поле код CVV карты с которой выполняется перевод
     */
    @Size(min = 3, max = 3, message = "код состоит из 3-х цифр")
    @NotNull(message = "Введите код CVV ")
    private String cardFromCVV;
    /**
     * поле суммы перевода
     */
    @NotBlank
    private Object amount;
}
