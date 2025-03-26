package observerpattern.observable;

import observerpattern.observer.NotificationAlertObserver;
import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable {
    public List<NotificationAlertObserver> observers = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (NotificationAlertObserver observer : observers) {
            observer.update();
        }
    }

    
    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
        notifyObservers();
    }

   
    public int getStockCount() {
        return stockCount;
    }
}