package Lessow_work_5.presenters;

import Lessow_work_5.models.Table;

import java.util.Collection;

public interface View {

    void setObserver(ViewObserver observer);
    void showTables(Collection<Table> tables);
    void showReservationResult(int reservationNo);
    void showChangeReservationResult(int reservationNo);

}
