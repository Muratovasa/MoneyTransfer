package com.example.moneytransfer.model;

import lombok.Data;

/**
 * Класс для обозначения статуса перевода
 *
 * @author svetlanamuratova
 * @version 1.1
 */

@Data
public class ConfirmOperation {
    /**
     * поле id операции
     */
    private String operationId;
    /**
     * поле кода выполнения операции (успешная или нет-по какой причине)
     */
    private String verificationCode;
}
