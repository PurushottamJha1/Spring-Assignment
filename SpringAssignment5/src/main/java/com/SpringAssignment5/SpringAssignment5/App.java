package com.SpringAssignment5.SpringAssignment5;

/**
 * Hello world!
 *
 */
import java.sql.SQLException;
import java.util.List;

public class App {
    public static void main(String[] args) {
        try {
            List<Trainer> trainers = TrainModel.getAllTrainersWithSessions();
            for (Trainer trainer : trainers) {
                System.out.println("Trainer: " + trainer.getName());
                System.out.println("Sessions:");
                for (SessionClass session : trainer.getSessions()) {
                    System.out.println("- " + session.getName());
                }
                System.out.println();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}