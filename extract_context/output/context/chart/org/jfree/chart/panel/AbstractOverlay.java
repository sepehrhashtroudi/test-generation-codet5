public AbstractOverlay()
public void addChangeListener(OverlayChangeListener listener)
public void removeChangeListener(OverlayChangeListener listener)
public void fireOverlayChanged()
protected void notifyListeners(OverlayChangeEvent event)
EventListenerList changeListeners