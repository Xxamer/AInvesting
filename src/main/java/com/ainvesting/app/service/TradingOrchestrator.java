package com.ainvesting.app.service;

import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TradingOrchestrator {
    private static final String TIME_ZONE = "Europe/London";
    @Scheduled(cron = "0 */2 * * * ?", zone = TIME_ZONE)
    public void runEvery2Min() {
        System.out.println("Running minute trading scan...");
    }
}
