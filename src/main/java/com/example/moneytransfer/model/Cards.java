package com.example.moneytransfer.model;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NonNull;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Component
public class Cards{
    private Date date;
    @NotNull(message = "Введите номер карты")
    @Size(min = 16, max = 16, message = "Номер карты состоит из 16 цифр")
    private int numberMyCard;
    @Size(min = 16, max = 16, message = "Номер карты состоит из 16 цифр")
    @NotNull(message = "Введите номер карты")
    private int numberCardTransfer;
    @Size(min = 4, max = 4, message = "ввести формат mm/dd из 4-х цифр")
    @FutureOrPresent
    @NotNull(message = "Введите срок действия карты")
    private Date dateCard;
    @Size(min = 3, max = 3, message = "код состоит из 3-х цифр")
    @NotNull(message = "Введите код CSV ")
    private int csv;
    @NotBlank
    private BigDecimal amount;
    List<String> logs;
}
