package auto.qinglong.activity.module.task;

public interface ItemInterface {
    void onLog(QLTask QLTask);

    void onStop(QLTask QLTask);

    void onRun(QLTask QLTask);

    void onEdit(QLTask QLTask);

    void onAction(QLTask QLTask, int position);
}