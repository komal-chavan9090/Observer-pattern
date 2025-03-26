package observerpattern;

import observerpattern.observable.IphoneObservable;
import observerpattern.observable.StockObservable;
import observerpattern.observer.EmailAlertObserver;
import observerpattern.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservable();

        NotificationAlertObserver observer1 = new EmailAlertObserver("kc8781686@gmail.com", iphoneObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("satyajit123@gmail.com", iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.setStockCount(10);
    }
}