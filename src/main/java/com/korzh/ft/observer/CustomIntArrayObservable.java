package com.korzh.ft.observer;

public interface CustomIntArrayObservable {
  void addObserver(CustomObserver customObserver);
  void removeObserver(CustomObserver customObserver);
  void notifyObservers();
}
