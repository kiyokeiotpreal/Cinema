package org.example.project_cinemas_java.repository;

import org.example.project_cinemas_java.model.Schedule;
import org.example.project_cinemas_java.model.Seat;
import org.example.project_cinemas_java.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepo extends JpaRepository<Ticket, Integer> {

    Ticket findTicketByScheduleAndSeat(Schedule schedule, Seat seat);

    boolean existsBySeatIdAndScheduleId(int seatId, int scheduleId);
    boolean existsBySeatAndScheduleNot(Seat seat, Schedule schedule);

    List<Ticket> findAllByScheduleAndCodeNotNullAndPriceTicketGreaterThan(Schedule schedule, int value);

}
