package observerpattern.observer;

import observerpattern.observable.StockObservable;
import observerpattern.observer.NotificationAlertObserver;

public class MobileAlertObserver implements NotificationAlertObserver {

    private String mob;
    private StockObservable stock;

    public MobileAlertObserver(String mob, StockObservable stock) {
        this.mob = mob;
        this.stock = stock;
    }

  
    public void update() {
        System.out.println("Message sent to " + mob + ": Stock is now " + stock.getStockCount());
    }
}