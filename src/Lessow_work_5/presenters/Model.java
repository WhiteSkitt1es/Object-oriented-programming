package Lessow_work_5.presenters;

import Lessow_work_5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);
    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);

}
