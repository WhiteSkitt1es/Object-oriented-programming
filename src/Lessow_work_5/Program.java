package Lessow_work_5;

import Lessow_work_5.models.TableModel;
import Lessow_work_5.presenters.BookingPresenter;
import Lessow_work_5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter presenter = new BookingPresenter(model, view);

        presenter.updateTablesUI();

        view.reservationTable(new Date(), 3, "Станислав");

        view.changeReservationTable(101, new Date(), 3, "Станислав");
    }
}
