package fsyt.ytweatherpro.mvp.model;

/**
 * Created by KevinWu on 16-3-12.
 */
public class EventModel<T> {
    private T data;

    public int getEventCode() {
        return eventCode;
    }

    public T getData() {
        return data;
    }

    private int eventCode = -1;

    public EventModel(int eventCode,T data){
        this.data=data;
        this.eventCode=eventCode;
    }
    public EventModel(int eventCode){
        this(eventCode,null);
    }

}
