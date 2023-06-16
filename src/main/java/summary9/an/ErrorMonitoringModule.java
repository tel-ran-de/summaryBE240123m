package summary9.an;

public class ErrorMonitoringModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг отслеживания ошибок стартовал!");
    }
}
