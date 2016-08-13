package edu.zipcloud.cloudstreetmarket.core.dtos;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class MarketOverviewDTO {
    private String marketShortName;
    private String marketId;
    private BigDecimal latestValue;
    private BigDecimal latestChange;

    public MarketOverviewDTO(String marketShortName, String marketId, BigDecimal latestValue, BigDecimal latestChange) {
        this.marketShortName = marketShortName;
        this.marketId = marketId;
        this.latestValue = latestValue;
        this.latestChange = latestChange;
    }
}