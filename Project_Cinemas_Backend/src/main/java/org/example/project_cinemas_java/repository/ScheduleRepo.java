package org.example.project_cinemas_java.repository;

import org.example.project_cinemas_java.model.Room;
import org.example.project_cinemas_java.model.Schedule;
import org.example.project_cinemas_java.payload.dto.scheduledtos.DayMonthYearOfScheduleByMovieDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepo extends JpaRepository<Schedule, Integer> {

    boolean deleteAllByRoom(Room room);

    List<Schedule> findAllByMovieId(int id);
    List<Schedule> findAllByRoom(Room room);

    Schedule findByRoom(Room room);

    @Query(nativeQuery = true,
            value = "SELECT DISTINCT DATE_FORMAT(s.start_at, '%d-%m-%Y') AS dayMonthYear " +
            "FROM cinemalts.schedule s " +
            "WHERE s.movie_id = :movieId " +
            "ORDER BY STR_TO_DATE(dayMonthYear, '%d-%m-%Y') ASC")
    List<String> findDistinctDayMonthYearByMovieId(@Param("movieId") int movieId);

    @Query(value = "SELECT SUBSTRING(s.start_at, 12, 5) AS StartTime, r.capacity, r.name, r.id " +
            "FROM cinemalts.schedule s " +
            "JOIN cinemalts.room r ON s.room_id = r.id " +
            "WHERE s.movie_id = :movieId AND DATE_FORMAT(s.start_at, '%Y-%m-%d') = STR_TO_DATE(:startDate, '%d-%m-%Y') " +
            "ORDER BY StartTime", nativeQuery = true)
    
    List<Object[]> findScheduleByMovieIdAndStartDate(@Param("movieId") int movieId, @Param("startDate") String startDate);

    @Query(nativeQuery = true,
            value = "SELECT s.id FROM cinemalts.schedule s WHERE TIME(s.start_at) = CONCAT(:startTime, ':00.000000')" +
                    "AND DATE_FORMAT(s.start_at, '%d-%m-%Y') = :startDate AND s.movie_id = :movieId")
    int findScheduleIdsByStartAtAndMovie(@Param("startTime") String startTime, @Param("startDate") String startDate, @Param("movieId") int movieId);

    @Query(nativeQuery = true,
            value = "SELECT s.price FROM cinemalts.schedule s WHERE TIME(s.start_at) = CONCAT(:startTime, ':00.000000')" +
                    "AND DATE_FORMAT(s.start_at, '%d-%m-%Y') = :startDate AND s.movie_id = :movieId")
    double getPriceBySchedule(@Param("startTime") String startTime, @Param("startDate") String startDate, @Param("movieId") int movieId);

    @Query(nativeQuery = true, value = "SELECT id " +
            "FROM cinemalts.schedule " +
            "WHERE movie_id = :movieId " +
            "AND room_id = :roomId " +
            "AND DATE_FORMAT(start_at, '%d-%m-%Y') = :date " +
            "AND TIME_FORMAT(start_at, '%H:%i') = :time")
    int findScheduleIdsByMovieIdAndRoomIdAndDateTime(
            @Param("movieId") int movieId,
            @Param("roomId") int roomId,
            @Param("date") String date,
            @Param("time") String time);
}
