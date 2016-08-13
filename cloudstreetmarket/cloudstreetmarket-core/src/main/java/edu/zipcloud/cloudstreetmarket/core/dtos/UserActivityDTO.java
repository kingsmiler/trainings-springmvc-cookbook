package edu.zipcloud.cloudstreetmarket.core.dtos;

import edu.zipcloud.cloudstreetmarket.core.enums.Action;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

@Getter
@Setter
public class UserActivityDTO {
    private String userName;
    private String urlProfilePicture;
    private Action userAction;
    private String valueShortId;
    private int amount;
    private BigDecimal price;
    private Date date;

    public UserActivityDTO(String userName, String urlProfilePicture, Action userAction,
                           String valueShortId, int amount, BigDecimal price, Date date) {
        this.userName = userName;
        this.urlProfilePicture = urlProfilePicture;
        this.userAction = userAction;
        this.valueShortId = valueShortId;
        this.amount = amount;
        this.price = price;
        this.date = date;
    }

    public UserActivityDTO(String userName, String urlProfilePicture, Action userAction,
                           String valueShortId, int amount, BigDecimal price, LocalDateTime date) {
        this.userName = userName;
        this.urlProfilePicture = urlProfilePicture;
        this.userAction = userAction;
        this.valueShortId = valueShortId;
        this.amount = amount;
        this.price = price;
        this.date = Date.from(date.toInstant(ZoneOffset.UTC));
    }
}
