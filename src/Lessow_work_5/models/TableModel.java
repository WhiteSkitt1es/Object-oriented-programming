package Lessow_work_5.models;

import Lessow_work_5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;

    /**
     * Получить список столиков
     */
    public Collection<Table> loadTables(){

        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     * @return номер резерва
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table : tables){
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                if(table.getReservations().add(reservation)){
                    return reservation.getId();
                }
            }
        }
        return -1;
    }

    /**
     * @param oldReservation номер бронирования
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     * @return номер удаленного резерва
     */
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        for (Table table : tables){
            if (table.getNo() == tableNo){
                Collection<Reservation> reservations = table.getReservations();
                for (Reservation reservation : reservations) {
                    if(reservation.getId() == oldReservation){
                        reservations.remove(reservation);
                        return oldReservation;
                    }
                }
            }
        }
        return -1;
    }
}
