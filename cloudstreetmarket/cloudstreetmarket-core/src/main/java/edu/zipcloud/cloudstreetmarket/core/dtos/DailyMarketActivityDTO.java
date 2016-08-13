package edu.zipcloud.cloudstreetmarket.core.dtos;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

@Getter
@Setter
public class DailyMarketActivityDTO {
    private String marketShortName;
    private String marketId;
    private Map<String, BigDecimal> values;
    private Date dateSnapshot;

    public DailyMarketActivityDTO(String marketShortName, String marketId, Map<String, BigDecimal> values, Date dateSnapshot) {
        this.marketShortName = marketShortName;
        this.marketId = marketId;
        this.values = values;
        this.dateSnapshot = dateSnapshot;
    }
}