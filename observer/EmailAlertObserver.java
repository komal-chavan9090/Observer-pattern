package observerpattern.observer;

import observerpattern.observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {
    public String email;
    public StockObservable stockObservable;

    public EmailAlertObserver(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    
    public void update() {
        System.out.println("Email sent to " + email + ": Stock is now " + stockObservable.getStockCount());
    }
}